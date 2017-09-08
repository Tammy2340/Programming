package realQuestion.今日头条.今日头条2017秋招;

import java.util.Scanner;

/**
 * Created by apple on 2017/8/22.
 * ------------------------------------------String Shifting--------------------------------
 * 题目描述

     我们规定对一个字符串的shift操作如下：
     shift(“ABCD”, 0) = “ABCD”
     shift(“ABCD”, 1) = “BCDA”
     shift(“ABCD”, 2) = “CDAB”
     换言之, 我们把最左侧的N个字符剪切下来, 按序附加到了右侧。
     给定一个长度为n的字符串，我们规定最多可以进行n次向左的循环shift操作。
     如果shift(string, x) = string (0＜= x ＜n), 我们称其为一次匹配(match)。求在shift过程中出现匹配的次数。
 *
 * 输入                                               样例输入
 *输入仅包括一个给定的字符串，只包含大小写字符。            byebyebye
 *
 * 输出                                               样例输出
 *输出仅包括一行，即所求的匹配次数。                      3
 */


public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
    }
}
