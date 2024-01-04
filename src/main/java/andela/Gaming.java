package andela;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Gaming { //https://leetcode.com/discuss/interview-question/850397/roblox-hackerrank-2021
    public static void main(String[] args) {
        Gaming gaming = new Gaming();
        List<Integer> scores = new ArrayList<>();
        scores.add(2);
        scores.add(2);
        scores.add(3);
        scores.add(4);
        scores.add(5);
        int i = levelUp(4, scores);
        System.out.println(i);
    }

    public static int levelUp(int k, List<Integer> score) {
        if(k <= 0) return 0;
        score.sort(Collections.reverseOrder());
        int rank = 1;
        int res = 0;
        for(int i = 0; i < score.size(); i++) {
            if(i == 0) {
                rank = 1;
            } else if(score.get(i) != score.get(i - 1)) {
                rank = i + 1;
            }
            if(rank <= k && score.get(i) > 0) res++;
            else break;
        }
        return res;
    }
}
