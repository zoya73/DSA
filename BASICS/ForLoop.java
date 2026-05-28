import java.util.*;

public class ForLoop{
     public int forLoop(int low,int high){
        int sum = 0;

        for(int i=low; i<= high ; i++){
            sum += i;

        }
        return sum;

     }



    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
         ForLoop fl = new ForLoop();
         int low = sc.nextInt();
         int high = sc.nextInt();
         int ans =fl.forLoop(low,high);
         System.out.println(ans);
    }     
}