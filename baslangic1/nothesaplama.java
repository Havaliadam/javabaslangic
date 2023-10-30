package baslangic1;
import java.util.Scanner;
public class nothesaplama {
    public static void main (String[]args){
//değişken oluştur
        int mat,fizik,kimya,turkce,tarih ,muzik;
//scanner tanımlama
Scanner np= new Scanner(System.in);
//deger al

 System.out.print("matematik notu:");
 mat=np.nextInt();

 System.out.print("fizik notu:");
 fizik=np.nextInt();

        System.out.print("kimya notu:");
        kimya=np.nextInt();

        System.out.print("türkçe notu:");
        turkce=np.nextInt();


        System.out.print("tarih notu:");
        tarih=np.nextInt();


        System.out.print("müzik notu:");
        muzik=np.nextInt();


        int toplam=(mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc=toplam / 6;
        System.out.print("ortalama:"+sonuc);




    }
}
