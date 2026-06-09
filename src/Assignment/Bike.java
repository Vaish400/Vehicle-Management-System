package Assignment;

class Bike extends Vehicle {

    public Bike(String brand, double speed, double fuelCapacity) {
        super(brand, speed, fuelCapacity);
    }

    @Override
    public double calculateFuelEfficiency() {
        return (fuelCapacity / speed) * 15;
    }

    @Override
    public String makeSound() {
        return "Vroom Vroom";
    }
}