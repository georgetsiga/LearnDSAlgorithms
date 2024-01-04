package recursion;

import java.util.Arrays;

public class Permutations {
    public static void main(String[] args) {
        String[] elements = new String[]{"a", "b", "c", "d"};
        new Permutations().permute(elements);
    }

    public void permute(String[] elements) {
        String input = "abc";
        permuteRecursively(input, 0, input.length());
    }

    public void permuteRecursively(String elements, int start, int end) {
        if (start == end - 1) {
            System.out.println("Perm: " + elements);
        } else {
            for (int i = start; i < end; i++) {
                elements = swap(elements, start, i);
                permuteRecursively(elements, start + 1, end);
                elements = swap(elements, start, i);
            }
        }
    }

    public String swap(String source, int start, int position) {
        char[] sourceChars = source.toCharArray();
        char tempChar;
        tempChar = sourceChars[start];
        sourceChars[start] = sourceChars[position];
        sourceChars[position] = tempChar;
        return String.valueOf(sourceChars);
    }
}
