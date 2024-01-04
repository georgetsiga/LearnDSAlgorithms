package andela;

import java.util.*;
import java.util.stream.Collectors;

public class Consecutives {
    public static int Consecutive(int[] arr) {
        // code goes here
        int consecutiveCount = 0;
        List<Integer> elements = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());

        for (int i = 1; i <= elements.size() - 1; i++) {
            consecutiveCount += (elements.get(i) - elements.get(i -1)) - 1;
        }
        return consecutiveCount;
    }

    public static void main (String[] args) {
        // keep this function call here
        int[] elements1 = new int[]{5, 10, 15};
        int[] elements2 = new int[]{-2,10,4};
        System.out.println("Expected: 8, Actual: " + Consecutive(elements1));
        System.out.println("Expected: 10, Actual: " + Consecutive(elements2));
    }
}
