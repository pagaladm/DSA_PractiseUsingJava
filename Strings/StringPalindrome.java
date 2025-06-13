package Strings;
import java.util.*;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.nextLine();

        // using 2pointer approach
        int left=0;
        int right=str.length()-1;
        boolean isPalindrome=true;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                isPalindrome=false;
                break;
            }
            left++;
            right--;
        }
        if(!isPalindrome){
                System.out.println("String is NOT Palindrome");
            }
            else{
                System.out.println("String IS a palindrome");
            }
        sc.close();
    }
}
