import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
        
        
        char[] one = word1.toCharArray();
        char[] two = word2.toCharArray();
        String result="";
        
        Arrays.sort(one);
        Arrays.sort(two);
        
        for(int i = 0 ; i <= one.length-1 ; i++){
            for(int j= 0 ; j <= two.length-1 ; j++){
                if(one[i] == two[j]){
                    result = result+one[i];
                    }
                }
                
            }
            System.out.print(result);
        
        }
}


----------------------OR------------------------

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        char[] one = word1.toCharArray();
        char[] two = word2.toCharArray();
        StringBuilder result = new StringBuilder();

        Arrays.sort(one);
        Arrays.sort(two);

        for (int i = 0; i < one.length; i++) {
            for (int j = 0; j < two.length; j++) {
                if (one[i] == two[j] && result.indexOf(String.valueOf(one[i])) == -1) {
                    // Add only if not already present
                    result.append(one[i]);
                }
            }
        }

        System.out.print(result.toString());
    }
}
