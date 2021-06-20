
import java.util.*;

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
   
}

class overriding extends Vehicle {
    void run() {
        super.run();
        System.out.println("Bike is running");
    }
    
    public static void main(String[] args){
        overriding obj = new overriding();
        obj.run();
    }
}
