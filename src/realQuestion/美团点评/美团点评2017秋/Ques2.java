package realQuestion.美团点评.美团点评2017秋;

import java.util.Scanner;

/**
 * Created by apple on 2017/8/30.
 * 给你六种面额 1、5、10、20、50、100 元的纸币，假设每种币值的数量都足够多，
 * 编写程序求组成N元（N为0~10000的非负整数）的不同组合的个数。
 *  输入描述:                                         输入例子1:
 *  输入包括一个整数n(1 ≤ n ≤ 10000)                   1
 *
 *  输出描述:                                         输出例子1:
 *  输出一个整数,表示不同的组合方案数                    1
 */

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long res = count(num);
        System.out.print(res);
    }

    public static long count(int n) {
        int[] coins = new int[] {1,5,10,20,50,100};
        long[] dp = new long[n+1];
        dp[0] = 1;
        /*
        * dp[j]=dp[j]+dp[j-coins[i]]不断更新dp[],遍历coins，每次从coins[i]的值到n循环更新dp[j]的值
        */
        for (int i=0;i<coins.length;i++) {
            for (int j=coins[i];j<=n;j++) {
                dp[j] = dp[j] + dp[j-coins[i]];
            }
        }
        return dp[n];
    }
}

