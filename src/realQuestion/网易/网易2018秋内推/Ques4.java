package realQuestion.网易.网易2018秋内推;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by apple on 2017/8/14.



        如果一个数列S满足对于所有的合法的i,都有S[i + 1] = S[i] + d, 这里的d也可以是负数和零,我们就称数列S为等差数列。
        小易现在有一个长度为n的数列x,小易想把x变为一个等差数列。小易允许在数列上做交换任意两个位置的数值的操作,并且交换操作允许交换多次。
        但是有些数列通过交换还是不能变成等差数列,小易需要判别一个数列是否能通过交换操作变成等差数列

        输入描述:
        输入包括两行,第一行包含整数n(2 ≤ n ≤ 50),即数列的长度。
        第二行n个元素x[i](0 ≤ x[i] ≤ 1000),即数列中的每个整数。

        输出描述:
        如果可以变成等差数列输出"Possible",否则输出"Impossible"。
 */


public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int len = sc.nextInt();
            //ArrayList in = new ArrayList();
            if(len==2){
                System.out.println("Possible");
            }
            int[] in=new int[len];
            for (int i=0;i<len;i++) {
                in[i]=sc.nextInt();
            }
            //Collections.sort(in);
            Arrays.sort(in);
            int d = in[1]-in[0];
            boolean flag = true;
            for (int i=0;i<len-1;i++) {
                while(in[i+1]!=in[i]+d) {
                    flag = false;
                    break;
                    //System.out.println("Impossible");
                }
        }
        if (flag)
            System.out.println("Possible");
        else
            System.out.print("Impossible");
    }
}

