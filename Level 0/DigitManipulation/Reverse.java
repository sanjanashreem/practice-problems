import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Long n = sc.nextLong();
        Long rev=0L ,ld;
        
        while(n>0){
            ld = n % 10;
            rev = rev * 10 + ld;
            n=n/10;
        }
        System.out.print(rev);
    }
}