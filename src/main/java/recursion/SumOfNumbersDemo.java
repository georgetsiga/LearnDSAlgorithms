package recursion;

public class SumOfNumbersDemo {
    public static void main(String[] args) {
        SumOfNumbersDemo sumOfNumbersDemo = new SumOfNumbersDemo();
        int sum = sumOfNumbersDemo.sum(5);
        System.out.println(sum);
    }


    public int sum(int n) {
        if (n == 1)
            return n;
        else
            return sum(n-1) + n;
    }
}
