package 剑指Offer.数组;

/**
 * Created by apple on 2017/8/14.
 */


/* ---------------------------------二维数组中的查找--------------------
   在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
   请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */


public class Ques1 {
    public boolean Find(int target, int[][] array) {
        int row = 0;
        int col = array[0].length-1;                    //二维数组array[row][col]
        while (row<=array.length-1 && col>=0) {
            if(array[row][col] == target) {
                return true;
            } else if(target>array[row][col]){
                row++;
            } else {
                col--;
            }
        }
        return false;
    }
}
