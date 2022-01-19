package com.company.javastreams;

import java.io.IOException;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOfDemo {

    /**
     * in this we will sort the list first,
     * then find the first element
     * and at the end we will print the first
     * element if it is present
     */

    public static void main(String[] ag) throws IOException {

        Stream.of("Ram", "Sham", "Khan")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println); // Khan


        /**  Now stream from array, sort filter and print */
        String[] names = {"Ali", "Ankit", "Shivika", "Sarika", "Hema", "Jya", "Shushma"};

        Arrays.stream(names) /** same as Stream.of(names) */
                .filter(name -> name.startsWith("S"))
                .sorted()
                .forEach(System.out::println);

                /** o/p -
                 * Sarika
                 * Shivika
                 * Shushma
                 * */

        /** Average of square of int Array */
        Arrays.stream(new int[] {1,2,3,4,5})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);

        /** Stream form List */

        List<String> people = Arrays.asList("Ali", "Ankit", "Shivika", "Sarika", "Hema", "Jya", "Shushma");
        people.stream()
                .map(String::toLowerCase)
                .filter(name -> name.startsWith("s"))
                .forEach(System.out::println);

        /** Stream rows from text file, sort, filter and print */

//        Stream<String> fileStream = Files.lines(Paths.get("path of the text file"));
//        fileStream
//                .sorted()
//                .filter(line -> line.length() > 10)
//                .forEach(System.out::println);
//        fileStream.close();

        /** summary statistics */
        IntSummaryStatistics summary = IntStream.of(1,2,3,5,4,6,7,8,9)
                                    .summaryStatistics();
        System.out.println(summary);

    }
}
