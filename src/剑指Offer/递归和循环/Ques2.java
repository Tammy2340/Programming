package 剑指Offer.递归和循环;

/**
 * Created by apple on 2017/9/1.
 * --------------------------------跳台阶-----------------------------
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Ques2 {
    public int JumpFloor(int target) {
        if(target==0){
            return 0;
        }
        int[] record = new int[target+1];
        record[0] = 1;
        record[1] = 1;
        for(int i=2;i<=target;i++) {
            record[i] = record[i-1]+record[i-2];
        }
        return record[target];
    }
}
