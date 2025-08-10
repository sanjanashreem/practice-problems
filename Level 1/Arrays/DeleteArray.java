import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int n = sc.nextInt();
        int a [] = new int[n];
        for(int i= 0 ; i<n ; i++){
            a[i] = sc.nextInt();
        }
        
        int pos = sc.nextInt();
        
        if(pos > n ){
            System.out.println("Deletion not possible.");
        }
        else{
            if(pos != -1){
        for(int i =pos-1 ; i < n-1;i++){
            a[i]= a[i+1];
        }
        n--;
        }
        for(int i =0 ; i< n ; i++){
            System.out.print(a[i]+ " ");
        }}
}
}