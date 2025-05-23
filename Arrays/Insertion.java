// insertion in array at a particular position in the array 

package Arrays;
public class Insertion {
    public static void main(String[] args) {
        System.out.println("Given array is:" );
        int[] arr=new int[6];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        int n=4;
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i]+" ");
    }

    System.out.println();

    int index=1;
    int value=15;

    // shifting the all the elements after index in reverse order
    for (int i = n; i >=index; i--) {
        arr[i+1]=arr[i];
    }
    arr[index]=value;
    n++;
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i]+" ");
    }

    }
    
}
