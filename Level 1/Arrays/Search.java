import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean found = false;
        int a [] = new int [n];
        for(int i=0 ; i<n ; i++){
            a[i] = sc.nextInt();
        }
        
        int s = sc.nextInt();
        
        for(int i = 0 ; i< n ; i++){
            if(s == a[i]){
                found= true;
            }
            
        }
        
        if(!found){
            System.out.println("Not found");
        }
        else{
                System.out.println("Found");
            }
    }
}