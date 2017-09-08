package realQuestion.华为.华为2017秋;

import java.util.Scanner;

/**
 * Created by apple on 2017/9/3.
 * 写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）
 *
 * 输入描述:                                输入例子1:
 * 输入一个十六进制的数值字符串                0xA
 *
 * 输出描述:                                输出例子1:
 * 输出该数值的十进制字符串。                 10
 */

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine().substring(2);
            int result = Integer.parseInt(s,16);
            System.out.println(result);
        }
    }
}
