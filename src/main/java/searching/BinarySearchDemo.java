package searching;

public class BinarySearchDemo {
    int count = 0;
    public static void main(String[] args) {
        int[] a = {15, 21, 47, 60, 75, 83, 96, 100};
        int l = 0;
        int r = a.length - 1;
        BinarySearchDemo binarySearchDemo = new BinarySearchDemo();
        int i = binarySearchDemo.binarySearch(a, 83, l, r);
        System.out.println("Result: " + i);
    }

    /**
     * Binary Search assume that the array is fully sorted
     * @param a  The array to search from
     * @param key The value we are searching for
     * @param l The start index of the array
     * @param r The upper index of the array
     * @return The index on which the key is found at or -1 if the key is not found
     */
    public int binarySearch(int[] a, int key, int l, int r) {
        System.out.println(count++);
        if (l > r)
            return -1;

        int mid = (l + r) / 2;
        if (key == a[mid])
            return mid;

        if (key < a[mid]) {
            //Lower
            return binarySearch(a, key, l, mid - 1);
        } else {
            //Upper
            return binarySearch(a, key, mid + 1, r);
        }
    }
}
