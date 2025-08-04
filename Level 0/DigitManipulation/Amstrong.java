import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int ld , sum = 0 , power =1,count=0;
        int copy = n ;
        
        
        while(n>0){
            n= n/10;
            count++;
        }
        n = copy;
        while(n>0){
            ld = n % 10;
            power = 1;
            for(int i = 1 ; i<= count; i++){
                power = power * ld; 
                //System.out.println(power);
            }
            sum = sum + power;
            n= n/10;
        }
        if(copy == sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }
}
