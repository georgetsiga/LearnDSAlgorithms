package turin;

public class ProblemOne {
    public static void main(String[] args) {
        ProblemOne problemOne = new ProblemOne();
        char theDifference = problemOne.findTheDifference("ae", "aea");
        System.out.println(theDifference);
    }

    public char findTheDifference(String s, String t) {
        char a[] = s.toCharArray();
        char b[] = t.toCharArray();

        bubbleSortTwo(a, a.length);
        bubbleSortTwo(b, b.length);

        for(int i=0;i<a.length;i++)
            if(a[i]!=b[i])
                return b[i];

        int size = b.length;
        return b[size-1];
    }

    private void bubbleSortTwo(char[] a, int n) {
        for (int pass = n - 1; pass >= 0; pass--) {
            for (int i = 0; i < pass; i++) {
                if (a[i] > a[i + 1]) {
                    char temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
    }
}
