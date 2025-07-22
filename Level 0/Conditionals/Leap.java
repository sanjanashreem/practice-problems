//check whether the given year is leap year or not using conditional construct

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Leap{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        n= sc.nextInt();
        
        if(n%400==0 ){
            System.out.println("Leap year");
        }
         else if(n%100 ==0 ){
            System.out.println("Not a Leap year");
         }
        else if(n% 4== 0){
            System.out.println("Leap year");
        
        }
        else{
            System.out.println("Not a Leap year");
        }
    }
}