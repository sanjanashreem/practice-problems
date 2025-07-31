import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n ;
        n = sc.nextInt();
        
        //int size = 2*n-1;
        
        for(int i =1 ; i <= n ; i++){
            for(int k =1  ; k < i ; k++){ 
                   System.out.print(" ");
            }
            //int stars = 2 * (n - i) + 1;
            for(int j = 1 ; j <= 2*(n-i)+1 ; j++){

                   System.out.print("*");
            }
            System.out.println();
        }
    }
}