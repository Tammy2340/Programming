import java.util.Scanner;

/**
 * Created by apple on 2017/8/31.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        char[] str = in.toCharArray();
        int start = 0;
        int end = 0;
        int max = 0;
        for (int i=0;i<str.length;i++) {
            if(!Character.isDigit(str[i])) {
                start =start-end+1;
                max = Math.max(max, end-start+1);
            } else{
               end = i;
            }
        }
        for (int i=start;i<=end;i++){
            System.out.print(str[i]);
        }
        System.out.println();
        System.out.print(max);
    }
}
