import java.util.*;
 
public class WhileLoop{
    public int whileLoop(int d){
    int i=1;
    int num = d,sum=0;
    while(i<=50) {
        sum = sum+num;
         num = num +10;     
         
         i++;   

         
        }return sum;
    }








    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        WhileLoop wl = new WhileLoop();
         int sum = wl.whileLoop(1); 
         System.out.println(sum);

    }
}