package realQuestion.美团点评.美团点评2017秋;

import java.util.Scanner;

/**
 * Created by apple on 2017/8/29.
 * ---------------------------------经典递归问题----------------------------
 * 大富翁游戏，玩家根据骰子的点数决定走的步数，
 * 即骰子点数为1时可以走一步，点数为2时可以走两步，点数为n时可以走n步。
 * 求玩家走到第n步（n<=骰子最大点数且是方法的唯一入参）时，总共有多少种投骰子的方法。
 *
 * 输入描述:                                       输入例子1:
 * 输入包括一个整数n,(1 ≤ n ≤ 6)                    6
 *
 * 输出描述:                                       输出例子1:
 * 输出一个整数,表示投骰子的方法                     32
 */

/*思路：设f(n)表示到第n步时总共有f(n)种投骰子的方法,那么到第n-1步时总共有f(n-1)种投骰子的方法;
        那么到第n-2步时总共有f(n-2)种投骰子的方法......
        规律: 从第n-1步到第n步，只有一种可能性（投骰子结果为 1 ），所以从第n-1步到第n步共有f(n-1)*1 种投骰子的方法；
        从第n-2步到第n步，只有一种可能性（投骰子结果为 2 ），所以从第n-2步到第n步共有f(n-2)*1 种投骰子的方法；
        从第n-3步到第n步，只有一种可能性（投骰子结果为 3 ），所以从第n-3步到第n步共有f(n-3)*1 种投骰子的方法；
        依次类推:f(n) = f(n-1)+f(n-2)+f(n-3)+....+f(1)+f(0),且f(1)=f(0)=1;*/

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(getSum(n));
    }
    public static int getSum(int n) {
        int count = 0;
        if (n==1)
            count = 1;
        else if (n==2)
            count =2;
        else{
            for (int i=1;i<n;i++) {
                count += getSum(n-i);             //计算f(n) = f(n-1)+f(n-2)+f(n-3)+....+f(1)
            }
            count = count+1;                         //再加f(0) = 1
        }
        return count;
    }
}
