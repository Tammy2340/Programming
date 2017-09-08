package 剑指Offer.递归和循环;

/**
 * Created by apple on 2017/9/1.
 * -------------------------------斐波那契数列------------------------------
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。n<=39
 */

public class Ques1 {
    public int Fibonacci(int n) {
        if(n==0) {
            return 0;
        }
        int[] record = new int[n+1];
        record[0] = 0;
        record[1] = 1;
        for(int i=2;i<=n;i++) {
            record[i] = record[i-1]+record[i-2];
        }
        return record[n];
    }
}
