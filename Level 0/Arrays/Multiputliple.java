import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a [] = new int[size];
        
        for(int i =0 ; i< size ; i++){
            a[i] = sc.nextInt();     
        }
        if(size < 2){
            System.out.println(a[0] * a[1]);
        }
        else{
            System.out.print(a[0] * a[0+1] + " ");
            for(int i = 1 ; i< size-1;i++){
                System.out.print((a[i-1]) * (a[i+1]) + " " );
             }
        
            System.out.print(a[a.length-2] * a[a.length-1]);
            }
    }
    }