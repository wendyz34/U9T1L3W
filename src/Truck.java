public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;
    private double fareCollected;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }

    public boolean validateLicensePlate() {
        if (hasTrailer) {
            String s = getLicensePlate().substring(getLicensePlate().length() - 2);
            boolean valid = (s.equals("MX") && axles > 4) || (s.equals("LX") && axles <= 4);
            return valid;
        }
            return true;

}
    @Override
    public double calculateTollPrice() {
        if(hasTrailer){
            return getTollFee()*axles*2;
        }
        return getTollFee()*axles;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("num axles: " +axles);
        System.out.println("trialers?: " +hasTrailer);
    }


}
