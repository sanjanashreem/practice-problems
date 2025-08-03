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
        int copy = n;
        
        for(int i =1 ; i <=n ; i++){
            for(int k = 1 ; k<= n-i; k++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}