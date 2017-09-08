package 剑指Offer.数组;

import java.util.Arrays;

/**
 * ------------------------数组中出现次数过半的数字--------------------------
 * Created by apple on 2017/8/29.
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */


public class Ques4 {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array==null)
            return 0;
        if(array.length==1)
            return array[0];
        Arrays.sort(array);
        int count = 1;
        int result = 0;
        for(int i=0;i<array.length-1;i++) {
            if (array[i]==array[i+1]){
                count++;
            } else {
                if (count>array.length/2){
                    result = array[i];
                    break;
                }else {
                    count = 1;
                }
            }
        }
        return result;
    }
}


        /*本题O(n)的思想是，定义两个变量temp和count，
        每次循环时，如果array[i]的值等于temp，则count自增一，如不等并且count>0，则count自减一，
        若array[i]的值不等于temp并且count不大于0，重新对temp赋值为当前array[i]，count赋值为1。
        如存在大于一半的数，直接返回temp就是了，但测试数据中有不存在的情况，
        所以最后又来了一遍校验，检查当前temp值是否出现过一半以上。*/