import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i = 1 ; i<= n ;i++){
            for( int sp = 1 ; sp <= n-i ;sp++){
                System.out.print(" ");
            }
            for(int c = 1 ; c <=i*2-1  ;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}