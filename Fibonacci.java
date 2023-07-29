import java.util.Scanner;

public class Fibonacci {
    public static void main(String [] args){
        int n1 =0, n2 =1, n3, i;
        System.out.println("Sayı girin fibonacciye göre dizilimini bulalım.");
        Scanner sc = new Scanner(System.in);
        int girilenSayi = sc.nextInt();
        
        for (i=2; i<girilenSayi+2; i++){
            n3 = n1+n2;
            System.out.println(" " + n3);
            n1=n2;
            n2=n3;
        }
        
     }  
}   


