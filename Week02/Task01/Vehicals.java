public class Vehicals {
    private int Speed;
    private int fuel;
    public Vehicals(int Speed, int fuel) {
        this.Speed = Speed;
        this.fuel = fuel;
    }

    public void displayDetails(){
        System.out.println("Speed: " + Speed);
        System.out.println("Fuel: " + fuel);
    }

    public static void main(String[] args) {

        Car car = new Car(120, 50, 4);
        Bike bike = new Bike(80, 15, 2);

        System.out.println("Car Details:");
        car.displayDetails();

        System.out.println("\nBike Details:");
        bike.displayDetails();
    }
}

class Car extends Vehicals{
    private int doors;
    Car(int Speed, int fuel, int doors) {
        super(Speed, fuel);
        this.doors = doors;
    }
}
class Bike extends Vehicals{
    private int wheels;
    Bike(int Speed, int fuel, int wheels) {
        super(Speed, fuel);
        this.wheels = wheels;
    }
}
