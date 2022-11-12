package recursion;

public class Power {
    public static void main(String[] args) {
        System.out.println(calPow(2,2));
    }

    private static int calPow(int a, int b) {
        if( b == 0) return 1;
        if(b%2 == 1) return a * calPow(a*a, b/2);
        return calPow(a*a, b/2);

    }
}
