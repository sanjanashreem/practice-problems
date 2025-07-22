//check the number is either divisible by 3 or divisible by 5 and display the corresponding message

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Divisible2 {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        int n;
        n=sc.nextInt();
      
        if(n%3==0 && n%5 == 0){
            System.out.println("HiHello");
        }
        else if(n%3==0){
            System.out.println("Hi");
        }
        else{
            System.out.println("Hello");
        }
        
    }
}

