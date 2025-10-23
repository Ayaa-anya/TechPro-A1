import java.util.Scanner;

public class Seatwork14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Car m = new Car();
        m.make = "Dodge Hellcat";
        m.color = "Black";

        System.out.println("Type 'on' to start the engine, or 'att' to view attributes. ");
        System.out.println("engine state is off");
        String command = input.nextLine();

        if (command.equalsIgnoreCase("on")) {
            System.out.println("----------");
            m.startEngine();
        } else if (command.equalsIgnoreCase("att")) {
            m.showAtts();
           
        } else {
            System.out.println("Unknown command.");
        }

        input.close();
    }
}

class Car {
    String make;
    String color;
    boolean engineState = false;

    void startEngine() {
        if (engineState) {
            System.out.println("The engine is already on.");
        } else {
            System.out.println("The engine is now on, mate!");
            engineState = true;
        }
    }

    void showAtts() {
        System.out.println("This car is an incredible shade of " + color + " " + make);
        
     
        	
        System.out.println("The engine is " + (engineState ? "on" : "off" + ", mate!"));
    }
}
