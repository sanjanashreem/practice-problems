import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int max = n/2;
        int val = 0;
        boolean found = false;
        
        int a[] = new int[n];
        for(int i = 0; i< n && sc.hasNextInt() ; i++){
            a[i] = sc.nextInt();
        }
        
        for(int i = 0; i<n ; i++){
            count = 0 ;
            for(int j = 0 ; j < n ; j++){
                if(a[i] == a[j]){
                    count++;
                    if(count > max){
                       val = a[i];
                        found = true;
                        //System.out.print(max +" "+ val);
                    }
                }
                //System.out.print(val);
            }   
        }
        
        
        if(found){
            System.out.println("The majority element is : " + val);
            
        }
        else{
            System.out.println("No majority element found in the array"); 
        }   
    }
}