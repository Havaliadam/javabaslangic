package baslangic1;
import java.util.Scanner;
public class kdvhesaplama {
    public static void main(String[]args){
double tutar,kdvoran=0.18;
Scanner input=new Scanner(System.in);
System.out.println("ücret tutari giriniz:");
tutar=input.nextDouble();
double kdtutar=tutar*kdvoran;
double kdvlitutar=tutar+kdtutar;

        System.out.println("kdv siz tutar"+tutar);
        System.out.println("kdv oran"+kdvoran);

        System.out.println("kdv tutar"+kdtutar);
System.out.println("kdv li tutar"+kdvlitutar);

        System.out.println(kdvlitutar);


    }
}
