import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int sum = 0,val;
        int a [] = new int[size];
        
        for(int i =0 ; i< size ; i++){
            a[i] = sc.nextInt(); 
            sum = sum+a[i];
        }
        for(int i = 0 ; i<size; i++){
            val = sum - a[i];
            System.out.print(val +" ");
        }
    }
}