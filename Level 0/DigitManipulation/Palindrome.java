import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n ,ld,rev = 0L;
        n =sc.nextLong();
        long copy = n;
        
        if(n<0){
            System.out.println("Not a Palindrome");
        }
        else{
            while(n>0){
            ld = n % 10;
            rev = rev*10 + ld;
            n = n/10;
        }
        
        if(copy == rev){
            System.out.println("Palindrome");
        }
        
        else{
            System.out.println("Not a Palindrome");
        }
        }
    }
}