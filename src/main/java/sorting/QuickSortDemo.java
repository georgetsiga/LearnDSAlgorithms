package sorting;

public class QuickSortDemo {
    public static void main(String[] args) {
        QuickSortDemo quickSortDemo = new QuickSortDemo();
        int[] a = {47, 76, 15, 60, 21, 96, 100, 83};
        quickSortDemo.quickSort(a, 0, a.length - 1);
        Output.display(a, a.length);
    }

    public void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);
            quickSort(a, low, pi - 1);
            quickSort(a, pi + 1, high);
        }
    }

    private int partition(int[] a, int low, int high) {
        int pivot = a[low];
        int i = low;
        int j = high;
        do {
            while (i < j && a[i] <= pivot) {
                i++;
            }
            while (i <= j && a[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(a, i, j);
            }
        } while (i < j);
            swap(a, low, j);
        return j;
    }

    public void swap (int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
