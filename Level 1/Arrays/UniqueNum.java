import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int count = 0;
        boolean found = false;
        
        for(int i =0 ; i< n ; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++){
            count= 0;
        for(int j = 0 ; j< n ; j++){
            if(a[i] == a[j]){
                count++;
            }
        }
        
        if(count == 1){
            System.out.print(a[i]+" ");
            found = true;
        }
    }
        if(!found){
            System.out.println("No unique elements in the array");
        }
        
}
    }
