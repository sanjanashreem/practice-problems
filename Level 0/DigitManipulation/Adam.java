import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n , ld , rev =0,square;
        int rev_square,rev_2 =0,ld_2;
        n= sc.nextInt();
        int copy = n;
        
        square = n*n; 
        
        
        while(n>0){
            ld = n % 10;
            rev = rev * 10 + ld ;
            n = n/10;
        }
        
        rev_square = rev*rev;

 
        while(rev_square>0){
            ld_2 = rev_square % 10;
            rev_2 = rev_2 * 10 +ld_2;
             rev_square = rev_square/10;
        }

        
        if(square == rev_2){
            System.out.println("Adam Number");
        }
        
        else{
            System.out.println("Not a adam number");
        }
    
    }
}