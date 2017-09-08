package realQuestion.今日头条.今日头条2017秋招;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by apple on 2017/8/22.
 *
 * 题目描述

     头条的2017校招开始了！为了这次校招，我们组织了一个规模宏大的出题团队。
     每个出题人都出了一些有趣的题目，而我们现在想把这些题目组合成若干场考试出来。
     在选题之前，我们对题目进行了盲审，并定出了每道题的难度系数。
     一场考试包含3道开放性题目，假设他们的难度从小到大分别为a, b, c，我们希望这3道题能满足下列条件：
     a＜= b＜= c
     b - a＜= 10
     c - b＜= 10
     所有出题人一共出了n道开放性题目
     现在我们想把这n道题分布到若干场考试中（1场或多场，每道题都必须使用且只能用一次），然而由于上述条件的限制，
     可能有一些考试没法凑够3道题，因此出题人就需要多出一些适当难度的题目来让每场考试都达到要求。
     然而我们出题已经出得很累了，你能计算出我们最少还需要再出几道题吗？

     输入                                                       样例输入
     输入的第一行包含一个整数n，表示目前已经出好的题目数量。           4
     第二行给出每道题目的难度系数 d1, d2, …, dn。                  20 35 23 40

     输出                                                       样例输出
     输出只包括一行，即所求的答案。                                 2

 */


public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] in = new int[n];
        for (int i=0;i<n;i++){
            in[i] = sc.nextInt();
        }
        Arrays.sort(in);
        int num = 0;
        for(int i=0;i<n;i++) {
            if(i+1<n && in[i+1]-in[i]>20){
                num +=2;
                continue;
            } else if (i+1<n && in[i+1]-in[i]>10){
                num++;
                i++;
                continue;
            }else if (i+1<n) {
                if (i + 2 < n && in[i + 2] - in[i + 1] <= 10) {               //两数之差小于等于10的时候  判断i+1与i+2的差值
                    i = i + 2;
                } else if (i + 2 < n) {
                    num++;
                    i++;
                } else {
                    num++;
                    i = i + 1;                                //不存在第三个数字
                }
            }else{
                num+=2;                                      //不存在i+1
            }
        }
        System.out.print(num);
    }
}
