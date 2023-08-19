public class Car implements Vehicle{
    private String engine;
    private String gps;
    private int seats;
    private String type;
    private boolean airbags;
    
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public void setGPS(String gps) {
        this.gps = gps;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setAirbags(boolean airbags) {
        this.airbags = airbags;
    }

    public void display(){
        System.out.println("This is car");
        System.out.println("Engine: "+ engine);
        System.out.println("Seats: " + seats);
        System.out.println("Airbags: " + airbags);
        System.out.println("Body type: " + type);
        System.out.println("GPS: " + gps);
    }

    
}
