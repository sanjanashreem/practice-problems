import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n,mid2 =0 ;
        n = sc.nextInt();
        int mid = (1+n)/2;
        if (n%2 ==0){
            mid2 = mid+1;
        }
        for(int i = 1; i<= n ;i++){
            for(int j =1 ; j <= n ; j++){
                if((i == mid && j == mid )  || (i == mid2 && j == mid2)){
                    System.out.print("0");
                }
                else if((i == mid && j == mid2)|| (i ==mid2 && j == mid)){
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