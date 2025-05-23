package Arrays;
import java.util.*;
public class Update {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("Enter the elements of the array one by one: ");
        int n=5;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.print("Index to update: ");
        int index=sc.nextInt();

        if(index<n && index>=0){
        System.out.print("\nNew Value: ");
        int value=sc.nextInt();

        // update the array
        arr[index]=value;
        // handling extreme cases
       
            // output
        System.out.println("\nUpdated Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        }
        else{
            System.out.println("Error: Invalid index!");
        }
        

        sc.close();
    }
}
