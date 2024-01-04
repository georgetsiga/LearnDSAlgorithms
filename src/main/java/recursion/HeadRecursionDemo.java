package recursion;

public class HeadRecursionDemo {
    public static void main(String[] args) {
        HeadRecursionDemo headRecursionDemo = new HeadRecursionDemo();
        headRecursionDemo.calculate(4);
    }

    public void calculate(int n) {
        if (n > 0) {
            calculate(n - 1);
            int k = n * n;
            System.out.println(k);
        }
    }


}
