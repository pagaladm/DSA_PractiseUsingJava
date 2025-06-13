package Strings;
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str1=sc.nextLine();
        int n=str1.length();
        char[] str2=new char[n];
        int j=0;
        for (int i =str1.length()-1; i >=0 ; i--) {
            str2[j]=str1.charAt(i);
            j++;
        }
        System.out.print("Reverse String: ");

        for (int i = 0; i< str2.length; i++) {
            System.out.print(str2[i]);
        }
        System.out.println();
        sc.close();
    }
}
