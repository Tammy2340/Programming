package realQuestion.网易.网易2018秋内推;

import java.util.Scanner;

/**
 * Created by apple on 2017/8/14.



       小易有一个长度为n的整数序列,a_1,...,a_n。然后考虑在一个空序列b上进行n次以下操作:
        1、将a_i放入b序列的末尾
        2、逆置b序列
        小易需要你计算输出操作n次之后的b序列。

        输入描述:
        输入包括两行,第一行包括一个整数n(2 ≤ n ≤ 2*10^5),即序列的长度。
        第二行包括n个整数a_i(1 ≤ a_i ≤ 10^9),即序列a中的每个整数,以空格分割。

        输出描述:
        在一行中输出操作n次之后的b序列,以空格分割,行末无空格。
*/



public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] a = new int[len];
        for (int i=0;i<len;i++){
            a[i] = sc.nextInt();
        }
        int[] b = new int[len];
        int k = len-1;
        int p = 0;
        int j = len-1;
        while (p<k){
            b[p] = a[j];
            j--;
            p++;
            if(p>k)
                break;                 //防止内存溢出
            b[k] = a[j];
            k--;
        }
        System.out.print(b[0]);
        for (int i=1;i<len;i++){
            System.out.print(" "+b[i]);
        }
    }
}

