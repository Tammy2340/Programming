package 剑指Offer;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by apple on 2017/8/22.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] arrSort = new int[n];
        int sum = 0;
        for (int i=0;i<n;i++){
            arrSort[i] = arr[i];
        }
        Arrays.sort(arrSort);
        int max = arrSort[n-1]*arrSort[n-1];
        for(int i=0;i<n;i++){
            sum = sum+arrSort[i];
        }
        if(max<sum*arrSort[0])
            max = sum*arrSort[0];
        System.out.print(max);
    }
}
