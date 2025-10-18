public class Engine imnplements EngineRequirements.java{

    //Attributes
    private FuelType fuelType; 
    private double currentFuelLevel;
    private double maxFuelLevel;    
    
    //Accessors
    public FuelType getFuelType() {
        return fuelType;
    }
    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }
    public double getMaxFuelLevel() {
        return maxFuelLevel;
    }

    //Constructor 
    public Engine(FuelType fuelType, double maxFuelLevel, double currentFuelLevel) {
        this.fuelType = fuelType;
        this.maxFuelLevel = maxFuelLevel;
        this.currentFuelLevel = maxFuelLevel;
    }

    //Methods
    public void refuel() {
        currentFuelLevel = maxFuelLevel;
    }   

    public Boolean go() {
        //need to decrease the current fuel level
        if (currentFuelLevel > 0) {
            return true;
        } else {
            return false;
        }   
        System.out.println("Current fuel level:" + currentFuelLevel);
    }
   public static void main(String[] args) {
       Engine myEngine = new Engine(FuelType.ELECTRIC, 0.0, 100.0);
       while (myEngine.go()) {
           System.out.println("Choo choo!");
       }
       System.out.println("Out of fuel.");
   }
}