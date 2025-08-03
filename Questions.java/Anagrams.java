import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        Main main = new Main();
        
        System.out.println(main.anagram(word1,word2));
        
    }
    boolean anagram(String word1, String word2){
        char[] one = word1.toCharArray();
        char[] two = word2.toCharArray();
        
        Arrays.sort(one);
        Arrays.sort(two);
        
        if(Arrays.equals(one,two)){
            return true;
        }
        else{
            return false;
        }
    }
}

