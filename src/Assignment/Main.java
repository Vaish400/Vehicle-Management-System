package Assignment;

public class Main {

    public static void main(String[] args) {

        Vehicle car = new Car("Toyota", 80, 50);
        Vehicle bike = new Bike("Royal Enfield", 60, 30);
        Vehicle truck = new Truck("Tata Truck", 40, 30);

        car.displayInfo();
        System.out.printf("Fuel Efficiency : %.2f km/l%n", car.calculateFuelEfficiency());
        System.out.println("Sound : " + car.makeSound());

        System.out.println();

        bike.displayInfo();
        System.out.printf("Fuel Efficiency : %.2f km/l%n", bike.calculateFuelEfficiency());
        System.out.println("Sound : " + bike.makeSound());

        System.out.println();

        truck.displayInfo();
        System.out.printf("Fuel Efficiency : %.2f km/l%n", truck.calculateFuelEfficiency());
        System.out.println("Sound : " + truck.makeSound());
    }
}