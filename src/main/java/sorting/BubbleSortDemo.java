package sorting;

public class BubbleSortDemo {
    public static void main(String[] args) {
        BubbleSortDemo bubbleSortDemo = new BubbleSortDemo();
        int[] a = {47, 76, 15, 60, 21, 96, 100, 83};
        bubbleSortDemo.bubbleSortTwo(a, a.length);
        Output.display(a, a.length);
    }

    private void bubbleSortOne(int[] a, int n) {
        boolean isSorted = false;
        while (!isSorted) {
            boolean swapMade = false;
            for (int i = 0; i < n; i++) {
                if (i + 1 < n) {
                    if (a[i] > a[i + 1]) {
                        int temp = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = temp;
                        swapMade = true;
                    }
                }
                isSorted = (i == n - 1) && !swapMade;
            }
        }
    }

    private void bubbleSortTwo(int[] a, int n) {
        for (int pass = n - 1; pass >= 0; pass--) {
            for (int i = 0; i < pass; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
    }
}
