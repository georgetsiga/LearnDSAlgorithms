package recursion;

public class TreeRecursionDemo {

    public static void main(String[] args) {
        TreeRecursionDemo treeRecursionDemo = new TreeRecursionDemo();
        treeRecursionDemo.calculate(3);
    }

    public void calculate(int n) {
       if (n > 0) {
           calculate(n-1);
            int k = n * n;
            System.out.println(k);
            calculate(n - 1);
        }
    }
}
