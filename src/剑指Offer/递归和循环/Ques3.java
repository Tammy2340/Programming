package 剑指Offer.递归和循环;

/**
 * Created by apple on 2017/9/1.
 * ---------------------------------变态跳台阶----------------------------
 *一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */

    /*思路：
    *               | 1       , (n=0 )
    *    f(n) =     | 1       , (n=1 )
    *               | 2*f(n-1), (n>=2)
    */

public class Ques3 {
    public int JumpFloorII(int target) {
        int[] dp = new int[target+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i=2;i<=target;i++) {
            dp[i] = 2*dp[i-1];
        }
        return dp[target];
    }
}
