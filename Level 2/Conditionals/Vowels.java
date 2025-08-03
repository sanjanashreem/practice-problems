import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        boolean isVowel = false;
        char a;
        a = sc.next().charAt(0);
        char[] arr = {'A','E','I','O','U','a','e','i','o','u'};
        
        for(int i=0;i<arr.length;i++){
            if(a == arr[i]){
                isVowel= true;
                break;
            }
        }
        
        if(isVowel){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
        
        
        
    }
}