package it.develhopeInterface;

public class Boat extends Vehicle{
    double maxKnotsSpeed;
    int boatKilosWeight;
    public Boat(double maxSpeed, int weight){
        super.type = "Boat";
        this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }

    public void doVehicleSound(){
        System.out.println(" ciuff ciuff");
    }
    public void getBoatWeightAndSpeed(){
       super.showVehicleDetails();
    System.out.println("La velocità dei nodi è di: "+ maxKnotsSpeed + " Il peso della barca è di: "+ boatKilosWeight);
    }
}
