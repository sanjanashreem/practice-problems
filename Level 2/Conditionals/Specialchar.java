import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
         Scanner sc = new Scanner(System.in);
    
    char a =sc.next().charAt(0);
    
    //char lower = a.islowerCase();   
     
    if(a >= 48 && a<= 57){
        System.out.println("NUMBER");
    }
    
    else if((a >= 65 && a <= 90 )||a >= 97 && a <= 122){
        System.out.println("ALPHABET");
    }
    else{
        System.out.println("SPECIAL CHARACTER");
    }
    //48-57
    //65-90
    
    }
}