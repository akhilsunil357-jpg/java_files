
    // Interface Vehicle
interface Vehicle {
    void start();
    void stop();
}

// Interface FuelBased
interface FuelBased {
    void refuel();
}

// Car class implementing both Vehicle and FuelBased
class Car implements Vehicle, FuelBased {

    public void start() {
        System.out.println("Car engine started.");
    }

    public void stop() {
        System.out.println("Car engine stopped.");
    }

    public void refuel() {
        System.out.println("Car is refueling at the station.");
    }
}

// ElectricScooter class implementing only Vehicle
class ElectricScooter implements Vehicle {

    public void start() {
        System.out.println("Electric scooter powered on.");
    }

    public void stop() {
        System.out.println("Electric scooter powered off.");
    }
}

// Main class
public class work8a {

    public static void main(String[] args) {

        // Create Car object
        Car car = new Car();
        car.start();
        car.refuel();
        car.stop();

        System.out.println("-------------------");

        // Create ElectricScooter object
        ElectricScooter scooter = new ElectricScooter();
        scooter.start();
        scooter.stop();
    }
}
    

