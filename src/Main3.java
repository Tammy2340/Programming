import java.util.Scanner;
public class Main3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] arr=str.toCharArray();
        int start=0;
        int end=0;
        int max=0;
        int maxStart=0;
        int maxEnd=0;
        while(end<arr.length){
            while(start<arr.length&&( !Character.isDigit(arr[start])))
                start++;
                end=start;
            while(end<arr.length&&num(arr[end])){
                end++;
            }
            if(max<=end-start){
                max=end-start;
                maxStart=start;
                maxEnd=end;
            }
            start=end;
        }
        if(max==0){
            System.out.print("");
            System.out.println(0);
        }
        else{
            for(int i=maxStart;i<maxEnd;i++)
                System.out.print(arr[i]);
                System.out.println();
                System.out.println(max);
        }

    }
    public static boolean num(char chr){

        if(chr<48 || chr>57)
            return false;
        else
            return true;
    }

}
