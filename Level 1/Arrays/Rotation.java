import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a[] = new int [n];
        
        for(int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
        }
        
        int k = sc.nextInt();
        for(int count = 1 ; count <= k % n ; count++){
            int copy = a[n-1];
            for(int j = n-1 ; j >= 1 ; j--){
                a[j] = a[j-1];
            }
            a[0]=copy;
        }
        
        for(int j = 0 ; j < n ; j++){
            System.out.print(a[j]+" ");
        }
        
    }
}