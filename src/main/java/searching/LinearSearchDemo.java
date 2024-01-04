package searching;

public class LinearSearchDemo {
    public static void main(String[] args) {
        LinearSearchDemo linearSearchDemo = new LinearSearchDemo();
        int[] a = {84, 21, 47, 96, 15};
        int i = linearSearchDemo.linearSearch(a, a.length, 52);
        System.out.println("Result: " + i);
    }

    public int linearSearch(int[] a, int n, int key) {
        int index = 0;
        while (index < n) {
            if (a[index] == key)
                return index;
            index++;
        }
        return -1;
    }
}
