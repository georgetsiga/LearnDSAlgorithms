package andela;

import java.util.Stack;

public class ArithGeo {
    public static void main(String[] args) {
        int[] elements1 = new int[]{5, 10, 15}; //Arith
        int[] elements2 = new int[]{2, 4, 16, 24}; //-1
        int[] elements3 = new int[]{2, 4, 8, 16, 32, 64}; //Geo
        int[] elements4 = new int[]{1,2,3,4,5,10,20}; // -1

        int[] elements5 = new int[]{2,6,18,54}; // Geo
        int[] elements6 = new int[]{100,200,400,800,1600}; // Geo
        int[] elements7 = new int[]{10,110,210,310,410,511}; // -1
        int[] elements8 = new int[]{5,10,20,40,80}; // Geo



        System.out.println("Expected: Arithmetic, Actual: " + ArithGeo.ArithGeo(elements1));
        System.out.println("Expected: -1, Actual: " + ArithGeo.ArithGeo(elements2));
        System.out.println("Expected: Geometry, Actual: " + ArithGeo.ArithGeo(elements3));
        System.out.println("Expected: -1, Actual: " + ArithGeo.ArithGeo(elements4));

        System.out.println("Expected: Geometry, Actual: " + ArithGeo.ArithGeo(elements5));
        System.out.println("Expected: Geometry, Actual: " + ArithGeo.ArithGeo(elements6));
        System.out.println("Expected: -1, Actual: " + ArithGeo.ArithGeo(elements7));
        System.out.println("Expected: Geometry, Actual: " + ArithGeo.ArithGeo(elements8));
    }

    public static String ArithGeo(int[] arr) {
        int previousArithDiff = arr[1] - arr[0];
        int geometricConstant = arr[1] / arr[0];
        String result = "-1";
        boolean isArithmentic = true;
        boolean isGeometric = true;

        for (int i = 1; i < arr.length - 1; i++) {
            if (isArithmentic) {
                isArithmentic = (previousArithDiff == (arr[i] - arr[i - 1]));
            }
            if (isGeometric) {
                isGeometric = (arr[i] == (arr[i - 1] * geometricConstant));
            }
        }

        if (isArithmentic) {
            result = "Arithmetic";
        } else if (isGeometric) {
            result = "Geometry";
        }
        return result;
    }
}
