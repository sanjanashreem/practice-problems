import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid1 = (1+n) /2;
        int mid2=0 ; 
        if(n%2==0){
             mid2 = mid1+1; 
        }
        int j=1;
        for(int i =1 ; i <= n ; i++ ){
              //System.out.print();
            for(j = 1 ; j<=n ; j++){
                 if( i == mid1 || j == mid1 || i == mid2 || j ==  mid2){
                   System.out.print("0");
                 }
                
                else{
                    System.out.print("1");
                }
            
        }
            System.out.println();
    }
}
}