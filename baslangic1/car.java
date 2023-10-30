package baslangic1;

 class car {
     //nitelikler
String type;
String model;
String color;
int speed;
int speedLimit=100;

//constructor metot
car(String model,String type,String color)
{
   this.model=model;
   this.type=type;
   this.color=color;
   this.speed=0;

}
int  increaseSpeed(int increment){

        speed+=increment;
        return speed;


}
int decreaseSpeend(int decrease){
    if(speed>0){
        speed-=decrease;
    }
    return speed;


}
void printSpeed(){
    System.out.println("speed:"+speed);
}
void printInfo(){
    System.out.println("================");
    System.out.println("Model : " + this.model);
    System.out.println("Color : " + this.color);
    System.out.println("Type : " + this.type);
    System.out.println("Speed : " + this.speed);

}

}
