package realQuestion.华为.华为2017秋;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by apple on 2017/9/3.
 * 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤1000），
 * 对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。
 * 然后再把这些数从小到大排序，按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作。
 *
 * 输入描述:
 * 输入多行，先输入随机整数的个数，再输入相应个数的整数
 *
 * 输出描述:
 * 返回多行，处理后的结果
 */

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i=0;i<n;i++) {
                nums[i] = sc.nextInt();
            }
            Arrays.sort(nums);
            System.out.println(nums[0]);
            for (int i=1;i<n;i++) {
                if (nums[i]!=nums[i-1]) {
                    System.out.println(nums[i]);
                }
            }
        }
    }
}
