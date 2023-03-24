public class Vehicle {
    private String licensePlate;
    private double tollFee;
    private int passengers;

    public Vehicle(String licensePlate, double tollFee, int passengers) {
        this.licensePlate = licensePlate;
        this.tollFee = tollFee;
        this.passengers = passengers;
    }

    public double calculateTollPrice() {
        return tollFee*getPassengers();
    }
    public String getLicensePlate(){
        return licensePlate;
    }
    public double getTollFee(){
        return tollFee;
    }
    public void newTollFee(double newVal){
        tollFee = newVal;

    }
    public int getPassengers(){
        return passengers;
    }
    public void newPassengers(int newValue){
        passengers = newValue;
    }
    public void printInfo(){
        System.out.println("License plate: " + licensePlate);
        System.out.println("Toll fee: " +tollFee);
        System.out.println("Passengers: " + passengers);
    }
}
