import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         for(int i =1 ; i<= n ; i++){
            for(int star1 = n ; star1 >= i ; star1--){
                System.out.print("*");
            }
            
            for( int j=2 ; j<= i*2-1 ; j++){
                System.out.print(" ");
            }
            
            for(int star2 = n; star2 >= i; star2--){
                    System.out.print("*");
                }
            System.out.println();
        }
        
        for(int i =n ; i>= 1 ; i--){
            for(int star1 = i ; star1 <= n ; star1++){
                System.out.print("*");
            }
            
            for( int j=2 ; j <= i*2 -1  ; j++){
                System.out.print(" ");
            }
            for(int star2 = i; star2 <= n; star2++){
                    System.out.print("*");
                }
            System.out.println();
        }
       
        }
    }
