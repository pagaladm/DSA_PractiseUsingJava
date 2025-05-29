package Arrays;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="madam";
        char[] arr=str.toCharArray();

        // reverse checking
        boolean isFound=true;
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]!=arr[right]){
               System.out.println("The string "+str+" is not a palindrome.");
               isFound=false;
            }
            left++;
            right--;           
        }
        if(isFound==true){
        System.out.println("The string "+str+" is a palindrome.");
        }

        sc.close();
    }
}
