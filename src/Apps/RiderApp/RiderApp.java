package Apps.RiderApp;

import Apps.DriverApp.Driver;
import Apps.shared.abstractions.App;
import Apps.shared.abstractions.Location;
import Apps.shared.abstractions.RideRequest;

public class RiderApp extends App {
    //Know where cars are
    //Request a ride
    //History
    //Payment

    private static final int RETURN_CAR_COUNT = 10;

    private Rider rider;
    private RideRequest rideRequest;

    public RiderApp() {
        this.rider = new Rider();
        this.rideRequest = new RideRequest();
    }

    public RiderApp(String firstName, String lastName) {
        this.rider = new Rider(firstName,lastName);
    }

    public Rider getRider() {
        return rider;
    }

    public RideRequest getRideRequest() {return rideRequest;}

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public void setRideRequest(RideRequest rideRequest) {
        this.rideRequest = rideRequest;
    }

    public void setRider(String firstName, String lastName, Double rating) {
        this.rider.setFirstName(firstName);
        this.rider.setLastName(lastName);
        this.rider.setRating(rating);
    }

    public Car[] fetchNearbyCars() {
        //sends a request to DB with current location
        Car [] nearbyCars = new Car[RETURN_CAR_COUNT];

        for (int i = 0; i < RETURN_CAR_COUNT; i++) {
            Car car = new Car();
            car.setCurrentLocation(new Location("423", "342"));
            car.setLicensePlate("ABS765D");
            car.setMake("HONDA");
            car.setModel("ACCORD");
            car.setDriver(new Driver("Vin","Diesel"));
            nearbyCars[i] = car;
        }

        return nearbyCars;
    }

    public RideRequest requestRide(String origin, String destination) {
        this.rideRequest = new RideRequest(origin,destination);
        return this.rideRequest;
    }

    @Override
    public String toString() {
        return "Rider\n" + rider.toString();
    }
}
