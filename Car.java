import java.util.arrayList;

public class Car implements CarRequirements.java {
    //Attributes
    private arraylist<Passenger> passengers;
    private int maxCapacity;    

    //Constructor
    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.passengers = new arraylist<Passenger>();
    }

    //Accessors
    public int getCapacity() {
        return maxCapacity; 
    }

    public int seatsRemaining() {
        return maxCapacity - passengers.size();
    }
    
    //Methods
    public Boolean addPassenger(Passenger p) {
       passengers.add(p);
       if (passengers.contains(p)) {
           return true;
       } else {
           return false;
       }    
    }

    public Boolean removePassenger(Passenger p) {
         passengers.remove(p);
            if (!passengers.contains(p)) {
                return true;
            } else {
                return false;
            }
    }   

    public void printManifest() {
        if (passengers.isEmpty()) {
            System.out.println("this car is EMPTY.");
        } else {
            //not sure yeyt
        }
    }
}