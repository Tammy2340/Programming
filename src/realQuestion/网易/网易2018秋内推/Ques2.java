package realQuestion.网易.网易2018秋内推;

import java.util.Scanner;

/**
 * Created by apple on 2017/8/14.
 *
 *
 *
      ------------------------交错01串-----------------------------
        如果一个01串任意两个相邻位置的字符都是不一样的,我们就叫这个01串为交错01串。例如: "1","10101","0101010"都是交错01串。
        小易现在有一个01串s,小易想找出一个最长的连续子串,并且这个子串是一个交错01串。小易需要你帮帮忙求出最长的这样的子串的长度是多少。

        输入描述:
        输入包括字符串s,s的长度length(1 ≤ length ≤ 50),字符串中只包含'0'和'1'

        输出描述:
        输出一个整数,表示最长的满足要求的子串长度。
*/


public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] data = sc.next().toCharArray();
        int len = data.length;
        int count = 1;
        int max = 1;
        if(len ==1){
            System.out.println(1);
        } else {
            for(int i=0;i<len-1;i++){
                if(data[i]!=data[i+1]){
                    count++;
                    if(max<count){max = count;}

                }else{
                    count = 1;
                }
            }
            System.out.println(max);
        }
    }
}

