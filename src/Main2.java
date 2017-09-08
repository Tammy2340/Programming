import java.util.Scanner;
import java.util.ArrayList;

public class Main2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if(m <= 1 || m >= 100){
            System.out.print("ERROR!");
            return;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1;i < 101;i++){
            list.add(i);
        }
        int i = 0;
        int count = 1;
        while(list.size() >= m){
            if(count == m){
                list.remove(i);
                count = 1;
                i = i % list.size();
            }else{
                count++;
                ++i;
                i = i % list.size();
            }
        }
        int j = 0;
        for(Integer temp:list){
            if(j != list.size()-1){
                System.out.print(temp + ",");
            }else{
                System.out.println(temp);
            }
            j++;
        }
    }
}
