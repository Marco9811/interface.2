package it.develhopeInterface;

public abstract class Vehicle {
    public String type;
    public int numberOfWheels;
    public void showVehicleDetails(){
        System.out.println(type + " "+ numberOfWheels);
    }
    public abstract void doVehicleSound();
}
