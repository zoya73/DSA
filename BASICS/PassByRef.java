import java.util.*;

public class PassByRef{
    
    public void reverse(int arr[]){
        int i=0,j=arr.length-1; 

        while( i<j) 
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        
        

    }


    public static void main(String [] args){
        PassByRef f1 = new PassByRef();
        int arr[] = {1,2,4,5,6}; 
        f1.reverse(arr);
        for (int i=0 ; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}