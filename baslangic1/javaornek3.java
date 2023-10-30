package baslangic1;
import java.util.Scanner;
public class javaornek3 {

    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("kaç tane sayi giriniz:");

int n=sc.nextInt();

        if (n <= 0) {
            System.out.println("Geçerli bir N değeri giriniz.");
            return;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.print("Sayı " + i + ": ");
            int sayi = sc.nextInt();

            if (sayi < min) {
                min = sayi;
            }

            if (sayi > max) {
                max = sayi;
            }
        }

        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);
    }
}








