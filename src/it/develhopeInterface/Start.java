package it.develhopeInterface;

public class Start {
    public static void main(String[] args) {
        Car golf = new Car(4, 5,3.5);
        Boat barca = new Boat(25.5,1200);
        golf.showVehicleDetails();
        barca.getBoatWeightAndSpeed();
    }
}
