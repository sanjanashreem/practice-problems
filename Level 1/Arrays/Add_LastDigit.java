import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array:");
        int size = sc.nextInt();
        int sum = 0;
        int [] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for(int i=0 ; i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0 ; i< arr.length;i++){
            if(arr[i] % 10 == 6){
                sum = sum+arr[i];
            }
        }
        
        
        System.out.println(sum);
        
        
    }
}

