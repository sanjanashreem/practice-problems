import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char a ;
        a = sc.next().charAt(0);
        
        if(a >= 97 && a <= 122){
            System.out.println("LOWERCASE");
        }
        else{
            System.out.println("UPPERCASE");
        }
    }
}