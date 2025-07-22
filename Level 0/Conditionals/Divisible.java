//check the number is divisible by 3 or not using conditional construct.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Divisible {

    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
        
        int n;
        n=sc.nextInt();
        int rem = n%3;
        if(n%3==0){
            System.out.println("The number is divisible by 3");
        }
        else{
            System.out.println("The number is not divisible by 3 and gives a remainder "+ rem);
        }
        
      
    }
}