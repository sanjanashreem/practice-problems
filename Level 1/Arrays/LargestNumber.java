import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int a[] = new int[n];
        
        for(int i = 0 ; i<n ; i++){
            a[i] =  sc.nextInt();
        }
        
        for(int i=0 ; i < n ; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        
        System.out.println(max);
    }
}