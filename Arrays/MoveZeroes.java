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
        int[] arr3={0,1,0,3,4,5,0,6};

        System.out.print("Input Array: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
        System.out.println();

        int nn=arr3.length;
        int left=0;
        int right=1;
        while(right<nn){
            if(arr3[left]==0){
                if(arr3[right]!=0){
                    int temp=arr3[right];
                    arr3[right]=arr3[left];
                    arr3[left]=temp;
                    left++;
                    right++;
                }
                else{
                    right++;
                }
            }
            else{
                left++;
                right++;
            }
        }

        
        
        // output
        System.out.print("Output Array: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
        System.out.println("\n");


    }
}
