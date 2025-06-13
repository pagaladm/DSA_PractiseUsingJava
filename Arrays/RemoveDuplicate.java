package Arrays;
import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,1,2,2,3,4,4,4,5};
        // input
        System.out.print("Input Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // remove duplicates
        // if you find any duplicate element then delete it from the array
        int left=0;
        int right=1;
        int n=arr.length;
        while(right<n){
        if(arr[left]==arr[right]){
            for (;right< n-1;) {
                arr[right]=arr[right+1];
            }
            n--;
        }
        else{
            left++;
            right++;
        }
    }
        
         // output
         System.out.print("Output Array: ");
         for (int i = 0; i < n; i++) {
             System.out.print(arr[i]+" ");
         }
         System.out.println();


        


        sc.close(

        );
    }
}
