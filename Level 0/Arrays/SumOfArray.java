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
        int sum = 0;
    
        for(int i =0 ; i< size ; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0 ; i< size; i++){
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}