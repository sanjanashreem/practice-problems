import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Long  a, ld;
        int count =0;
        Long n = sc.nextLong();
        a = sc.nextLong();
        
        while(n> 0){
            
            ld = n % 10;
            n = n / 10;
            
            if(ld ==  a){
                count++;
            }
        }
        System.out.println(count);
    }
}