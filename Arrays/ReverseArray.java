package Arrays;
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        System.out.println("\n/* Using method 1: use of duplicate array */");
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




        System.out.println("\n/* Using Method 2: using two pointers */");
        // input string
        System.out.print("Enter the number of elements in an array: ");
        int a=sc.nextInt();
        int arr3[]=new int[a];
        System.out.println("Enter the elements one by one: ");
        for (int i = 0; i < a; i++) {
            arr3[i]=sc.nextInt();
        }

        int left=0;
        int right=a-1;
        int temp;
        while(left<right){
            // swapping using temp 
            temp=arr3[right];
            arr3[right]=arr3[left];
            arr3[left]=temp;
            left++;
            right--;
        }

        System.out.print("Reverse Array: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
        System.out.println("\n");


        sc.close();
    }
}
