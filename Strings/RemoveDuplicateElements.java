package Strings;
import java.util.*;
public class RemoveDuplicateElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();
        int n=str.length();
        char[] str2=new char[n];
        for (int i = 0; i < str.length(); i++) {
            int isDuplicateFound=0;
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    isDuplicateFound=1;
                    break;
                }
            }
            if(isDuplicateFound==0){
                str2[i]=str.charAt(i);
            }
        }
        System.out.print("String after removing duplicate elements: ");
        for (int i = 0; i< str2.length; i++) {
            System.out.print(str2[i]);
        }
        System.out.println();
        sc.close();
    }
}
