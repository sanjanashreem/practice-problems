import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a,ld,sum=1  ;
        a = sc.nextInt();
        
        while(a > 0){
            ld = a % 10;
            a = a / 10;
            sum = sum * ld;
        }
        System.out.println(sum);
    }
}