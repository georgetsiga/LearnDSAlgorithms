package sorting;

public class InsertionSortDemo {

    public static void main(String[] args) {
        InsertionSortDemo insertionSortDemo = new InsertionSortDemo();
        int[] a = {47, 76, 15, 60, 21, 96, 100, 83};
        insertionSortDemo.insertionSort(a, a.length);
        Output.display(a, a.length);
    }

    private void insertionSort(int[] a, int n) {
        for (int i=0; i<n; i++) {
            int cValue = a[i];
            int position = i;

            while (position > 0 && a[position-1] > cValue) {
                a[position] = a[position-1];
                position = position-1;
            }
            a[position] = cValue;
        }
    }
}
