package baslangic1;

public class siniflar {

public static void main(String[]args){

car audi=new car("a7","audi","red");
    audi.increaseSpeed(20);
    audi.printInfo();
/*audi.model="audi a3";
audi.type="sport";
audi.color="blue";
audi.speed=30;*/
    //System.out.println("Audi Hızı : " + audi.speed);

car bmw=new car("bm6","bmw","blue");
    bmw.increaseSpeed(10);
    bmw.increaseSpeed(25);
    bmw.increaseSpeed(5);
    bmw.decreaseSpeend(25);
    bmw.printInfo();


/*
bmw.speed=58;
bmw.model="bmw jip";
bmw.type="sport";
bmw.color="black";
*/

   //System.out.println("bmw Hızı : " + bmw.speed);
car mercedes=new car("sport","mercedes","black");
    mercedes.speed = 20;
    mercedes.printInfo();



/*mercedes.model="a7";
mercedes.type="sport";
mercedes.color="white";
mercedes.speed=100;*/
    //System.out.println("mercedes Hızı : " + mercedes.speed);







}
}
