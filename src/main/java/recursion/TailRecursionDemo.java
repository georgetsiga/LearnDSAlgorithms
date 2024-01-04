package recursion;

public class TailRecursionDemo {

    public static void main(String[]  args) {
        TailRecursionDemo tailRecursionDemo = new TailRecursionDemo();
        tailRecursionDemo.calculate(5);
    }

    public void calculate(int n) {
       if (n > 0) {
            int k = n * n;
            System.out.println(k);
            calculate(n - 1);
        }
    }
}
