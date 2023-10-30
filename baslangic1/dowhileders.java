package baslangic1;

import java.util.Scanner;

public class dowhileders {
    public  static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int pass;
        boolean askPassword=true;

        do{
            System.out.println("şifre giriniz:");
            pass=input.nextInt();
            if(pass==123){
                System.out.println("doğru");
                askPassword=false;
            }else {
                System.out.println("yanlış");
            }

        }while (askPassword);





     /*   int year = 2020;
        do
        {
            System.out.println("Döngü işletiliyor");
            year++;
        } while (year < 2020);


      */


    }
}
