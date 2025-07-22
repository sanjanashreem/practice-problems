//check the number is odd or even using conditional construct


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OddEven{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        n=sc.nextInt();
        
        if(n%2==0){
            System.out.println("EVEN");
        }
        else{
             System.out.println("ODD");
        }
        sc.close();
    }
}