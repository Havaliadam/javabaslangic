package baslangic1;

public class localdegisken {
    static void ekranaBas(){
        //hatalı kullanım
       // System.out.println(a);
    }
    public static void main(String[]args){
        int a=10;
        if(a<10){
            int b=20;
            a=20;
            System.out.println(a);
        }
        //hatalı kullanım
        //System.out.println(b);
    }
}
