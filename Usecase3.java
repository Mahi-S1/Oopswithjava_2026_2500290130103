interface Rentable {
    static double TAX_RATE = 0.05; 
    double calculateRent(int days);
}
class Car implements Rentable{
    static int totalVehiclesRented=0;
    public double calculateRent(int days){
        totalVehiclesRented++;
        return days*1500;
    }
}
class Bike implements Rentable{
    public double calculateRent(int days){
        Car.totalVehiclesRented++;
        return days*500;
    }
}
public class Usecase3 {
    public static void main(String[] args) {
        Rentable car = new Car();
        Rentable bike = new Bike();
 
        double carRent = car.calculateRent(3);
        double bikeRent = bike.calculateRent(2);
 
        System.out.println("Car rent incl. tax: " + (carRent + carRent * Car.TAX_RATE));
        System.out.println("Bike rent incl. tax: " + (bikeRent + bikeRent * Bike.TAX_RATE));
        System.out.println("Total vehicles rented: " + Car.totalVehiclesRented);
    }
}

