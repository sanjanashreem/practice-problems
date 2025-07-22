//check the values are equal or not

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CheckEqual{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a ;
        int b;
        
        a= sc.nextInt();
        b= sc.nextInt();
        
        if(a == b){
            System.out.println("EQUAL");
        }
        else{
            System.out.println("NOT EQUAL");
        }
    }
}