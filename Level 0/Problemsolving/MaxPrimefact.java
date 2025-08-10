import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int count =0;
        int copy = n;
        
        int Max = Integer.MIN_VALUE;
        for(int i = 2 ; i < n ; i++ ){
            if(n % i == 0){
                int num = i;
                count++;
                if(num > Max ){
                    Max = num;
                }
            }
        }
        if(count == 0){
            System.out.println(copy);
        }
        else{
            System.out.println(Max);
        }
    }
}

