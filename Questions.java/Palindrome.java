import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String word1 = sc.nextLine();
        
        Main main = new Main();
        System.out.println(main.palindrome(word1));
    }
    
    boolean palindrome(String word1){
        
        //char [] check = word1.toCharArrays();
        String rev ="";
        for(int i = word1.length()-1 ; i >= 0 ; i--){
            rev = rev+word1.charAt(i);
        }
        
        if(word1.equals(rev)){
            return true;
        }
        else{
            return false;
        }
        
    }
}