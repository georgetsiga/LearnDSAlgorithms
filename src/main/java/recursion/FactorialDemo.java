package recursion;

public class FactorialDemo {
    public static void main(String[] args) {
        FactorialDemo factorialDemo = new FactorialDemo();
        int fact = factorialDemo.factorial(5);
        System.out.println(fact);
    }

    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }
}
