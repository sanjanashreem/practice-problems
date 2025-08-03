import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid = (n+1)/2;
        if(n%2 == 0){
            mid = mid+1;
        }
        for(int i = 1 ; i <= n ; i++){
            for(int j= 1 ; j <= n ; j++){
                if(i == mid || j == mid){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}