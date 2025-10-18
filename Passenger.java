public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }
    
    public Boolean boardCar(Car c){
    boolean sucess = c.addPassenger(this);
    return sucess;
    }

    public Boolean getOffCar(Car c){
    boolean sucess = c.removePassenger(this);
    return sucess;

    }
}
