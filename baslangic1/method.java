package baslangic1;

public class method {
   static int power(int base,int exp){
        int result=1;
        for(int i=1;i<=exp;i++){
            result*=base;
        }
        return result;

    }

    public static void main(String[]args){

        //f(x) 2x+5
        //f(6) 2*6+5=17
        //f(x,y,z) 3x+2y+5z
        //f(3,5,7) 3*3+2*5+7*5
       // int n1=2,n2=3;


    System.out.println(power(2,3));
        System.out.println(power(5,3));
    }
}
