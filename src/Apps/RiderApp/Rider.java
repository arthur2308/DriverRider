package Apps.RiderApp;

import Apps.shared.abstractions.Person;
import Apps.shared.abstractions.RideRequest;

public class Rider extends Person {

    RideRequest rideRequest;

    public Rider() {
        super(false);
        rideRequest = new RideRequest();
    }

    public Rider(String firstName, String lastName) {
        super(firstName,lastName,false);
        rideRequest = new RideRequest();
    }

    public RideRequest requestRide(String origin, String destination) {
        RideRequest rideRequest = new RideRequest(origin, destination);
        return rideRequest;
    }
}