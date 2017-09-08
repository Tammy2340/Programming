package realQuestion.美团点评.美团点评2018秋内推;

import java.util.Scanner;

/**
 * Created by apple on 2017/9/1.
 * 我们定义一个由数字 0 和 1 组成的序列是交错序列，当且仅当在这个序列中 0 和 1 是轮流出现的，比如，0，010，10101 都是交错序列。
 * 现在给出了一个由数字 0 和 1 组成的序列A，它可能不是一个交错序列，但是你可以从这个序列中选择一些数字出来，
 * 按他们在序列𝐴中原有的相对顺序排列(即选取𝐴的一个子序列)，使得你最后得到的是一个交错序列。问这样能得到的交错序列的最长长度是多少。
 *  输入
 *  第一行包含一个整数𝑛，表示输入序列的长度。1 ≤ 𝑛 ≤ 105
 *  第二行包含𝑛个 0 或 1，表示对应的序列。
 *
 *  输出
 *  输出能够得到的最长交错序列的长度。
 */

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int[] num = new int[n];
        for (int i=0;i<n;i++) {
            num[i] = sc.nextInt();
        }
        if (n==1)
            System.out.print(1);
        for (int i=0;i<n-1;i++) {
            if (num[i]!=num[i+1]){
                count++;
            }
        }
        System.out.print(count);
    }
}
