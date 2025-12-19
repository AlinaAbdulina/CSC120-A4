import java.util.ArrayList;

public class Car implements CarRequirements {

    /** 
     * The list of passengers 
     */
    private ArrayList<Passenger> passengers;

    /** 
     * The maximum number of passengers in a car 
     */
    private int maxCapacity;    

    /**
     * Construct a Car with the given maximum capacity.
     * @param maxCapacity maximum seats available in the car
     */
    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.passengers = new ArrayList<Passenger>();
    }

    /** 
     * @return the maximum seating capacity of the car 
     */
    public int getCapacity() {
        return this.maxCapacity; 
    }

    /** 
     * @return remaining number of empty seats 
     */
    public int seatsRemaining() {
        return this.maxCapacity - this.passengers.size();
    }
    
    /**
     * Add a passenger to this car
     * @param p passenger to add
     * @return true if passenger was added
     */
    public Boolean addPassenger(Passenger p) {
        if (seatsRemaining() > 0 && !passengers.contains(p)) {
            passengers.add(p);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Remove a passenger from this car
     * @param p passenger to remove
     * @return true if passenger was removed
     */
    public Boolean removePassenger(Passenger p) {
        if (passengers.contains(p)) {
            passengers.remove(p);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Print a manifest for this car
     */
    public void printManifest(){
        if (this.passengers.isEmpty()) {
            System.out.println("This car is EMPTY.");
            return;
        }

        System.out.println("Passengers on this car:");
        for (Passenger p : this.passengers) {
            System.out.println(" - " + p.toString());
        }
    }

}