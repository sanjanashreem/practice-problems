import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int k ;
        
        for(int i = 1 ; i <= n; i++){
            
            for(int j = 1 ; j <= n+1; j++){
                if(j == 1 && i%2 == 0){
                    k=i+1;
                }
                else if(j == n+1 && i%2 != 0){
                    k= i+1;
                }
                else{
                    k = i;
                }
                
                System.out.print(k +" ");
            }
            System.out.println();
        }
    }
}