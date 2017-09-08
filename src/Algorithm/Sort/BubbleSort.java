package Algorithm.Sort;

/**
 * Created by apple on 2017/9/8.
 * 冒泡排序算法的运作如下：
 *   ①. 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 *   ②. 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
 *   ③. 针对所有的元素重复以上的步骤，除了最后一个。
 *   ④. 持续每次对越来越少的元素重复上面的步骤①~③，直到没有任何一对数字需要比较。
 *
 *  平均时间复杂度	最好情况	最坏情况	空间复杂度
 *    O(n²)        	O(n)	O(n²)	O(1)
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        for (int i=arr.length-1;i>0;i--) {    //外层循环移动游标
            boolean flag = false;
            for (int j=0;j<i;j++) {         //内层循环遍历游标及之后(或之前)的元素,
                if (arr[j]>arr[j+1]) {
                    flag = true;
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
            if (flag == false) {
                for (int k =0;k<arr.length;k++){
                    System.out.print(arr[k]);
                }
            }
        }
    }

    public static void main(String[] args){
        int[] a={3,22,94,2,6,36,301,18,75,66,9,3};
        System.out.println(a.length+" ");
        bubbleSort(a);
        for (int num:a)
            System.out.print(num+" ");
    }
}

