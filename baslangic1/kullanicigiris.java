package baslangic1;

import java.util.Scanner;

public class kullanicigiris {
    public static void main(String[]args){
    String ad,parola;
        Scanner np=new Scanner(System.in);
        System.out.println("adınızı girin:");
        ad=np.nextLine();

        System.out.println("parola giriniz:");
        parola=np.nextLine();

        if (ad.equals("patika")&& parola.equals("java123")){
            System.out.println("başarılı şekilde giriş yapıldı");
        }else{
            System.out.println("bilgi yanlış");
        }







    }
}
