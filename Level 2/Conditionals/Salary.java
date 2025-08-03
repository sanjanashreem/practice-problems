import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a ;
        int result; 
        a= sc.nextInt();
        
        //double val = (double) a;
        if(a <= 10000){
            int hra = (20*a)/100;
            int da = (80*a)/100;
            result = a + hra + da;
            double val = (double) result;
            System.out.printf("Rs.%.2f",val);
        }
        else if(a <= 20000){
            int hra = (25*a)/100;
            int da = (90*a)/100;
            result = a + hra + da;
            double val = (double) result;
            System.out.printf("Rs.%.2f",val);
        }
        else if(a > 20000){
            int hra = (30*a)/100;
            int da = (95*a)/100;
            result = a + hra + da;
            double val = (double) result;
            System.out.printf("Rs.%.2f",val);
        }
        else{
            System.out.println("Invalid");
        }
    }
}