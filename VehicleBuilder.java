public interface VehicleBuilder {
    public void BuildType();
    public void BuildEngine();
    public void BuildSeats();
    public void BuildAirbags();
    public void BuildGPS();
    
    public Car getCar();
    public Bike getBike();

}
