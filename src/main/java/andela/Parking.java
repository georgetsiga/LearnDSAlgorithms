package andela;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Parking {
    public static void main(String[] args) {
        Parking parking = new Parking();
        //int[] cars = {6,2,12,7};
        int[] carsArr = {2, 10, 8, 17};
        List<Long> cars = new ArrayList<>();
        cars.add(2L);
        cars.add(10L);
        cars.add(8L);
        cars.add(17L);
        Long i = parking.carParkingRoof(cars, 3);
        int ii = parking.ParkingDilemma(carsArr, 3);
        System.out.println(i);
        System.out.println(ii);
    }

    public static long carParkingRoof(List<Long> cars, int k) {
        // Write your code here
        if (cars.size() == 0 || k < 0) {
            return 0;
        }

        Collections.sort(cars);
        long minDist = Long.MAX_VALUE;

        for (int i = 0; i <= cars.size() - k; i++) {
            minDist = Math.min(minDist, cars.get(i + k - 1) - cars.get(i));
        }

        return minDist + 1;
    }

    public int ParkingDilemma(int[] cars, int k) {
        // write your code here
        Arrays.sort(cars);
        int len = cars.length;
        int min = cars[k-1] - cars[0];
        for (int i = 1; i <= len - k; i++) {
            if (min > cars[k-1+i] - cars[i]) {
                min = cars[k-1+i] - cars[i];
            }
        }
        return min +1;
    }
}
