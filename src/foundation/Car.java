package foundation;

class Vehicle{}

public class Car extends Vehicle {
    public static void main(String[] args){
        Vehicle car = new Car();
        System.out.println(car instanceof Vehicle);
    }
}