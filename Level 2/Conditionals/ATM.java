import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notes = {  500 , 100 , 50 , 20 , 10 ,5 , 2 , 1 };
        int n ;
        n = sc.nextInt();
        System.out.println("Total number of notes: ");
        for (int note : notes) {
            int count = n / note;
            System.out.println(note + " : " + count);
            n = n % note;
        }
        
    }
}