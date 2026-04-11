 class Car {
    String Mirror;
    String color;
    int seats;
    Car(String Mirror,String color,int seats){
        this.Mirror=Mirror;
        this.color=color;
        this.seats=seats;
    }
    void accelerate(){
        System.out.println("car is accelerating");
    }
    void brake(){
        System.out.println("car has brakes");
    }
    void display(){
        System.out.println("The mirror is:"+Mirror);
        System.out.println("The color of the car is:"+color);
        System.out.println("The number of seats are:"+seats);
    }
}
public class Mercedes extends Car{
    Mercedes(String Mirror,String color,int seats){
        super(Mirror,color,seats);
    }
    void accelerate(){
        System.out.println("The mercedes has very high acceleration");
    }
    void brake(){
        System.out.println("The mercedes has high power breaks");
    }
public static void main(String[] args){
    Mercedes m1=new Mercedes("Auto rotating","red",4);
    m1.display();
    m1.accelerate();
    m1.brake();
}  

}

