package Algorithm.Sort;

/**
 * Created by apple on 2017/9/8.
 *  快速排序使用分治策略来把一个序列（list）分为两个子序列（sub-lists）。步骤为：
 *   ①. 从数列中挑出一个元素，称为”基准”（pivot）。
 *   ②. 重新排序数列，所有比基准值小的元素摆放在基准前面，所有比基准值大的元素摆在基准后面（相同的数可以到任一边）。在这个分区结束之后，该基准就处于数列的中间位置。这个称为分区（partition）操作。
 *   ③. 递归地（recursively）把小于基准值元素的子数列和大于基准值元素的子数列排序。
 *
 *   平均时间复杂度	最好情况	    最坏情况	    空间复杂度
 *   O(nlog₂n)	    O(nlog₂n)	O(n²)	    O(1)（原地分区递归版）
 */
public class QuickSort {
    /**
     * @param arr    待排序数组
     * @param low    左边界
     * @param high   右边界
     */
    public static void quickSort(int[] arr, int low, int high) {
        if (arr.length<=0)
            return;
        if (low>=high)
            return;
        int left = low;
        int right = high;
        int tmp = arr[low];                    //选取基准值
        while (left<right){
            while (right>left&&arr[right]>tmp)
                right--;
            arr[left]=arr[right];
            while (left<right&&arr[left]<=tmp)
                left++;
            arr[right]=arr[left];
        }
        arr[left]=tmp;
        quickSort(arr,low,left-1);
        quickSort(arr,right+1,high);
    }

    public static void main(String[] args){
        int[] a={3,22,94,2,6,36,301,18,75,66,9,3};
        System.out.println(a.length+" ");
        quickSort(a,0,a.length-1);
        for (int num:a)
            System.out.print(num+" ");
    }
}
