package it.develhopeInterface;

public class Car extends Vehicle {
    public int numberOfDoors;
    public double carPrice;
    public Car(int wheels, int doors, double price){
        super.type = "car";
        this.numberOfDoors = doors;
        this.carPrice = price;
        this.numberOfWheels = wheels;
    }
    public void showVehicleDetails(){
        super.showVehicleDetails();
        System.out.println("Le porte della macchina sono: "+ this.numberOfDoors);
    }
    public void doVehicleSound(){
        System.out.println("brum brum");
    }
}
