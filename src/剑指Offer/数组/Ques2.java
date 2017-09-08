package 剑指Offer.数组;

/**
 * Created by apple on 2017/8/20.

 ----------------------调整数组顺序事奇数位于偶数前面---------------------
 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。

 */


public class Ques2 {
    public void reOrderArray(int [] array) {
        int[] myArr = new int[array.length];
        int j = 0;
        for (int i=0;i<array.length;i++) {
            if (array[i]%2==1) {
                myArr[j]=array[i];
                j++;
            }
        }
        for (int i=0;i<array.length;i++) {
            if(array[i]%2==0) {
                myArr[j] =array[i];
                j++;
            }
        }
        for (int i=0;i<array.length;i++) {
            array[i] = myArr[i];
        }
    }
}
