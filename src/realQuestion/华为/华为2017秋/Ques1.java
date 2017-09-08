package realQuestion.华为.华为2017秋;

import java.util.Scanner;

/**
 * Created by apple on 2017/9/2.
 * 有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。
 * 小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？”答案是5瓶，
 * 方法如下：先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。
 * 然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。
 * 如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？
 *
 *  输入描述:                                                              输入例子1:
 *  输入文件最多包含10组测试数据，每个数据占一行，                              3
 *  仅包含一个正整数n（1<=n<=100），表示小张手上的空汽水瓶数。                  10
 *  n=0表示输入结束，你的程序不应当处理这一行。                                81
 *                                                                        0
 *
 *  输出描述:                                                              输出例子1:
 *  对于每组测试数据，输出一行，表示最多可以喝的汽水瓶数。                       1
 *  如果一瓶也喝不到，输出0。                                                5
 *                                                                        40
 */

public class Ques1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n!=0){
                System.out.println(drink(n));
            }
        }
    }
    public static int drink(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 0;
        arr[2] = 1;
        for (int i=3;i<=n;i++) {
            arr[i] = i/3+arr[i/3+i%3];
        }
        return arr[n];
    }
}
