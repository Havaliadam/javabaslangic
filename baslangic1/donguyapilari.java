package baslangic1;

import java.util.Scanner;

public class donguyapilari {

    public static void main(String[]args){
         int password;
         boolean ispasswordSucces=false;
        Scanner input =new Scanner(System.in);
        System.out.println("şifre giriniz:");
        password=input.nextInt();
        while (!ispasswordSucces){
            if(password==123){
                System.out.println("doğru");
                ispasswordSucces=true;
            }else{
                System.out.println("yanlış");
        }

        }



      /*
        int left=100,right=200;
    while (++left<--right);


    System.out.println(left);
       int i=1;
        int k;
        System.out.println("program başladı");

        while (i<=5){
            System.out.println(i);
            i++;
            k=1;
        while (k<=10){
            System.out.println(k+",");
            k++;
        }
        }
        System.out.println("program bitti");

       */
    }
}
