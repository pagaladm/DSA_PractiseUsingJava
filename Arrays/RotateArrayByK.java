package Arrays;
import java.util.*;
public class RotateArrayByK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int[] arr={10,20,30,40,50};
            // input
            System.out.print("Input Array: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
            // rotate the array by k positions
            System.out.println("Positions to rotate: ");
            int k=sc.nextInt();

            int n=arr.length;
            int[] arr2=new int[n];

            // insert into new array
            for (int i = 0; i <= n-k; i++) {
                arr2[k]=arr[i];
                k++;
            }
        // insert last element  first
            for(int i=k-1;i<k && i>=0;i--){
                arr2[i]=arr[n-1];
                n--;
            }
            System.out.print("Output Array: ");
            for (int i = 0; i < arr2.length; i++) {
                System.out.print(arr2[i]+ " ");
            }
            System.out.println();


        sc.close();
    }
}
