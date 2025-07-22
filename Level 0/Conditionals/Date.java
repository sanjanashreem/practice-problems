//check whether the date is valid or not. Year will be in range 1900 to 9999


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Date {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String date;
        date = sc.nextLine();
        
        String[] str_arr = date.split("/");
        
        int date_ = Integer.parseInt(str_arr[0]);
        int month = Integer.parseInt(str_arr[1]);
        int year = Integer.parseInt(str_arr[2]);
        
        
        if(year>= 1900 && year< 9999 && month>= 1 && month< 12 ){
            if((month == 4 || month == 6 || month == 9 || month == 11)&& (date_>=1 && date_<=30)){
                System.out.println("Valid");
            }
            else if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (date_>=1 && date_<=31)){
                System.out.println("Valid");
            }
            else if(month == 2){
                if((year % 4 == 0 && year % 100 != 0)||year % 400 ==0){
                    if(month == 2 && (date_>=1 && date_<=29)){
                        System.out.println("Valid");
                    }
                    else{
                        if (date_ >= 1 && date_ <= 28) {
                            System.out.println("Valid");
                         } else {
                            System.out.println("Invalid");
                        }
                    }
                }
                else{
                    System.out.println("Invalid");
                }
                
            }
            else{
                System.out.println("Invalid");
            }
        }
        else{
             System.out.println("Invalid");
        }
    }
        
}