package recursion;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinatories {
    public static void main(String[] args) {
        String[] elements = new String[]{"a", "b", "c", "d"};
        String [] results = new Combinatories().combinations(elements);
        System.out.println(Arrays.toString(results));
    }

    public String [] combinations(String[] elements) {
        if (elements.length == 0) {
            return new String[]{" "};
        }
        String firstElem = elements[0];
        String[] restOfElem = Arrays.copyOfRange(elements, 1, elements.length);
        String [] combsWithoutFirst = combinations(restOfElem);
        List<String> combsWithFirst = new ArrayList<>();

        for (String item: combsWithoutFirst) {
            String combination = (firstElem + item).trim();
            combsWithFirst.add(combination);
        }
        String [] result = Arrays.copyOf(combsWithoutFirst, combsWithoutFirst.length + combsWithFirst.size());
        System.arraycopy(combsWithFirst.toArray(), 0, result, combsWithoutFirst.length, combsWithFirst.size());
        return result;
    }
}
