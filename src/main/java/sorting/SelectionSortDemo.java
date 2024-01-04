package sorting;

import static sorting.Output.display;

public class SelectionSortDemo{
    public static void main(String[] args) {
        SelectionSortDemo selectionSortDemo = new SelectionSortDemo();
        int[] a = {47, 76, 15, 60, 21, 96, 100, 83};
        selectionSortDemo.selection(a, a.length);
        display(a, a.length);
    }

    private void selection(int[] a, int n) {

        for (int i = 0; i < n - 1; i++) {
            int position = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[position])
                    position = j;
            }
            int temp = a[i];
            a[i] = a[position];
            a[position] = temp;


        }
    }


}
