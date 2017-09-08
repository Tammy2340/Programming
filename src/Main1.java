import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by apple on 2017/9/6.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pepole = sc.nextInt();
        int beer = sc.nextInt();
        int[] drink = new int[pepole];
        for (int i =0;i<pepole;i++) {
            drink[i] = sc.nextInt();
        }
        int[] now = new int[beer];
        for (int i=0;i<beer;i++) {
            now[i] = drink[i];
        }
        Arrays.sort(now);
        if (beer>pepole){
            System.out.print(now[pepole-1]);
        }
        for (int j=beer;j<pepole;j++){
            Arrays.sort(now);
            now[0] = now[0]+drink[j];
        }
        System.out.print(now[beer-1]);
    }
}
