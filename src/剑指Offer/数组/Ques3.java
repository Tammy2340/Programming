package 剑指Offer.数组;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by apple on 2017/8/25.
 *
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,
 */

public class Ques3 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> leastNum = new ArrayList<Integer>();
        if(input.length<k) {
            return leastNum;
        }
        Arrays.sort(input);
        int tmp = 0;
        if (k<=0)
            return leastNum;
        leastNum.add(input[0]);
        for (int i=1;i<input.length;i++) {
            if (tmp < k-1) {
                if (input[i] != input[i-1]) {
                    leastNum.add(input[i]);
                    tmp++;
                } else {
                    i = i + 1;
                }
            }
        }
        return leastNum;
    }
}
