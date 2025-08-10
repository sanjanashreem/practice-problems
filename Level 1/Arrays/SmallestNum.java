import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int a[]  = new int[n];
        int min = Integer.MAX_VALUE;
        
        for(int i = 0 ; i<n; i++){
            a[i]=sc.nextInt();
            
        }
        for(int i = 0 ; i<n ; i++){
            if(a[i] < min){
                min = a[i];
            }
        
        }
         System.out.println(min);   
    }
}