import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ld;
        int n = sc.nextInt();
        
        while(n>0){
            ld = n % 10;
            //rev = rev*10+ld;
            System.out.print(ld+" ");
            n = n/10;
        }
        
        
    }
}