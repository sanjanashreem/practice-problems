class Main {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int cur = 0;
    int next = 0 ;
    int a [] = new int[n];
    
    for(int i = 0 ; i< n ; i++){
        a[i] = sc.nextInt();
    }
    
    for(int i = 0 ; i< n-1 ; i++){
        cur = a[i];
        next = next +1 ;
        //System.out.println(cur +" "+ next);
        if(cur != next){
            System.out.println(next + " ");
        }
        next = a[i];
    }
    }
}