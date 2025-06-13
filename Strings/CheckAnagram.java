package Strings;
import java.util.*;
public class CheckAnagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter both strings: ");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int isAnagram=1;
        for (int i = 0; i < str1.length(); i++) {
            int isLetterFound=0;
            for (int j = 0; j < str2.length(); j++) {
                if(str1.charAt(i)==str2.charAt(j)){
                    isLetterFound=1;
                    break;
                }
            }
            if(isLetterFound==0){
                isAnagram=0;
                break;
            }

        }
        if(isAnagram==1){
            System.out.println("Both the strings are anagram.");
        }
        else{
            System.out.println("Strings are not anagram.");
        }

        sc.close();
    }
}
