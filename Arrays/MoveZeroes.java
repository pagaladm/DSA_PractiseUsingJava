package Arrays;
import java.util.*;
public class MoveZeroes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        System.out.println("\n/* Using method 1: use of duplicate array */");

        int[] arr={0,1,0,3,12,67,0,47,0,5};
        System.out.print("Input Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int n=arr.length;
        int[] arr2=new int[n];
        int k=0;
        // using duplicate array
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                arr2[n-1]=0;
                n--;
                continue;
            }
            else{
                arr2[k]=arr[i];
                k++;
            }
        }

        // output
        System.out.print("Output Array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println("\n");

        System.out.println("\n/* Using Method 2: using two pointers */");
        int a=arr.length;
        int arr3[]=new int[a];
        int left=0;
        int right=0;
        while(left<right){
            if(arr[left]!=0){
                arr[right]=arr[left];
            }
            else{
                continue;
            }
            left++;
            right++;
        }
        
        // output
        System.out.print("Output Array: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
        System.out.println("\n");


    }
}
