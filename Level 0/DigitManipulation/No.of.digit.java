import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long a = sc .nextLong();
        int count =0 ;
        
        while(a > 0){
            a = a/10;
            count++;
        }
        
        System.out.println(count);
    }
}