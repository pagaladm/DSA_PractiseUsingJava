package Strings;
import java.util.*;
public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int countVowels=0,countConsonants=0;
        System.out.print("Enter the string: ");
        String str=sc.nextLine();
        char[] vowels={'a','e','i','o','u'};
        for (int i = 0; i < str.length(); i++) {
        boolean isVowelFound=false;
            for (int j = 0; j < vowels.length; j++) {
               if(str.charAt(i)==vowels[j]){
                countVowels++;
                isVowelFound=true;
                break;
               }
            }
            if(isVowelFound==false){ 
            countConsonants++;
            }
        }
        System.out.println("Number of vowels: "+countVowels);
        System.out.println("Number of consonants: "+countConsonants);
        sc.close();
    }
}
