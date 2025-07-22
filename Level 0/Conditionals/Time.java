//check whether the time is valid or not using conditional construct.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Time{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String time;
        
        time = sc.nextLine();
        String[] tim_arr = time.split(":");
        
        int hour = Integer.parseInt(tim_arr[0]);
        int minutes = Integer.parseInt(tim_arr[1]);
        int seconds = Integer.parseInt(tim_arr[2]);
        
        if(hour >=0 && hour <24 && minutes >= 0 && minutes<60 && seconds >= 0 && seconds <60 ){
            System.out.println("Valid");
        }
        else{
            System.out.println("Not Valid");
        }
    }
}