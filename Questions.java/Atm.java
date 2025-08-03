import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double ld;
        double n = sc.nextDouble();
        
        double [] arr= {2000.0,500.0,200.0,100.0,50.0,20.0,10.0,5.0,2.0,1.0,0.5};
        
        for(int i=0 ; i<=arr.length-1;i++){
            ld = n / arr[i];
            int count = (int) ld;
            System.out.println(count);
            n = n % arr[i];
        }
    }
}