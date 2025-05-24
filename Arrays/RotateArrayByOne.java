package Arrays;
import java.util.*;
public class RotateArrayByOne {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int[] arr={10,20,30,40,50};
        // show array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // rotate the array by one
        int n=arr.length;
        int[] arr2=new int[n];

        // shift the elements
        for (int i = 0; i < n-1; i++) {
            arr2[i+1]=arr[i];
        }
        // last element at first
        arr2[0]=arr[n-1];

        // output
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

    sc.close();
    }
}
