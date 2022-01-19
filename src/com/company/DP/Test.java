package com.company.DP;

import com.company.SOLID.openClosed.Substraction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("Sunita", 20));
        list.add(new Student("Amul", 30));
        list.add(new Student("Kusum", 40));

        Predicate<Student> p = name -> (name.getName().startsWith("S"));

//       list.stream().filter(name -> name.getName().startsWith("S")!=true)
//               .map(name -> name.getName())
//               .collect(Collectors.toList());

       list.removeIf(n -> p.test(n));

       for (Student a : list)
           System.out.println(a.getName());


    }
}
class Student {

    public String name;
    public int age;

    public Student(String name , int age) {
        this.name = name ;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


