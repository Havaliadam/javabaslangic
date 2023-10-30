package baslangic1;

public class asiriyukleme {
static void  print(){
    System.out.println("parametresiz metot  ");
}
static  void print(int a){
    System.out.println("parametreler:"+a);
}
static  int print(int x,int y){
    return x+y;
}
static int print (int a,int b,int c){
    return a+b+c;

}
public static void main(String []args){
print();
print(12);
System.out.println(print(5,8));
    System.out.println(print(5,8,5));
}

}
