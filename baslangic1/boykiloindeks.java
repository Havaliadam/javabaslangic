package baslangic1;
import java.util.Scanner;
public class boykiloindeks {


    public static void main(String[]args){
        Scanner np=new Scanner(System.in);
        double boy,kilo;
        System.out.println("boy giriniz(cm) biçiminde :");
        boy=np.nextDouble();
        System.out.println("kilo giriniz:(kg) biçiminde :");
        kilo=np.nextDouble();
        boy=boy/100;
        double vki=kilo/boy*boy;
        System.out.println(kilo);
        System.out.println(boy);
        System.out.println(vki);


    }
}
