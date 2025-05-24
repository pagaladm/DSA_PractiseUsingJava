package Arrays;
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        int[] arr={1,2,3,4,5};
        System.out.print("Input Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // reverse the array
        int n=arr.length;
        int[] arr2=new int[n];

        for(int i=0;i<arr.length;i++){
            arr2[n-1]=arr[i];
            n--;
        }

        // output
        System.out.print("Reverse Array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
