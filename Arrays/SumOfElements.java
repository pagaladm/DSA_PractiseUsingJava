package Arrays;
import java.util.*;
public class SumOfElements {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int[] arr={10,20,30,40,50};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // sum of elements
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }

        // output
        System.out.println("Sum of the elemts is: "+ sum);



    sc.close();
    }
}
