package baslangic1;
import java.util.Scanner;
public class verialma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*int a,b;

        System.out.println("A sayısını giriniz : ");
        a = input.nextInt();

        System.out.println("B sayısını giriniz : ");
        b = input.nextInt();

        System.out.println("A Sayısı : " + a);
        System.out.println("B Sayısı : " + b);*/
        Scanner inp = new Scanner(System.in);

         String adsoyad = inp.nextLine();
          int yas = inp.nextInt();
        double maas = inp.nextDouble();

        // Çıktılar
        System.out.println("Ad Soyad:"+ adsoyad);
        System.out.println("Yaş : " + yas);
        System.out.println("Maaş : " + maas);
    }
}
