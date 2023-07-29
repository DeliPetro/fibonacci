import java.util.Scanner;

public class Fibonacci2 {
    
    static int f(int x){
        
        
        if(x==1 || x==2)
            return 1;
        
        
            return f(x-1) + f(x-2);
         
     }

    public static void main(String [] args){
        System.out.println("Sayı girin fibonacciye göre değerini bulalım.");
        Scanner sc = new Scanner(System.in);
        int girilenSayi = sc.nextInt();
    System.out.println(f(girilenSayi));
     }  
}   
