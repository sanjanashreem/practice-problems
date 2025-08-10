import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        
        int pre = ++a;
        int post = b++;
        
        System.out.println("Pre increment:"+ pre);
        System.out.println("Post increment:"+ post++);
        System.out.printf("Final values:%d %d",pre, post);
        
    }
}