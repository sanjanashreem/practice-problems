import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        int i ;
       
        
        for( i = 2 ; i< n ; i++){
            if(n%i == 0){
               break;
            }
        }
        System.out.println(i);
        
    }
}