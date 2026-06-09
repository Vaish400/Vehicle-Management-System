package Assignment;

abstract class Vehicle {

    protected String brand;
    protected double speed;
    protected double fuelCapacity;

    public Vehicle(String brand, double speed, double fuelCapacity) {
        this.brand = brand;
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + " | Speed: " + speed + " km/h");
    }

    public abstract double calculateFuelEfficiency();

    public abstract String makeSound();
}