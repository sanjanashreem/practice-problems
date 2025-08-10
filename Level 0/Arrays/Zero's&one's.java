import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int count = 0;
        int a [] = new int[size];
        
        for(int i =0 ; i< size ; i++){
            a[i] = sc.nextInt();     
        }
        for(int i = 0 ; i< size ; i++){
            if(a[i] == 0){
                count++;
            }
        }
        System.out.println("zc = "+count);
        System.out.println("oc = "+(size-count));
        
    }
}