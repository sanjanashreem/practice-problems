import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val= 0;
        int n = sc.nextInt();
        //boolean found = false;
        int k = sc.nextInt();
        
        int a[] = new int[n];
        
        for(int i =0 ; i<n ; i++){
            a[i] = sc.nextInt();
        }
        
        Arrays.sort(a);
        
        if(k > n){
            System.out.println("Out of Range");
        }
        else{
            for(int i = 0 ; i< n ; i++){
            val = a[k-1];
            }
            System.out.println(val);
        }
        
    }
}