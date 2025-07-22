//determine the sign of the input using conditional constructs
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PositiveNegative {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int n;
        
        n= sc.nextInt();
        
        if(n>0){
            System.out.println("Positive");
        }
        else if(n==0){
            System.out.println("Zero");
        }
        else{
             System.out.println("Negative");
        }
    }
}

