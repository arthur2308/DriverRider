import Apps.DriverApp.Car;
import Apps.DriverApp.Driver;
import Apps.DriverApp.DriverApp;
import Apps.RiderApp.Rider;
import Apps.RiderApp.RiderApp;
import Apps.shared.abstractions.Location;

public class Factory {

    public Rider createRider(String firstName, String lastName, Double rating) {
        Rider rider = new Rider(firstName,lastName);
        rider.setRating(rating);
        return rider;
    }

    public DriverApp createDriverApp() {
        return new DriverApp();
    }

    public RiderApp createRiderApp() {
        return new RiderApp();
    }

    public DriverApp createDriverApp(int takenSeats, int capacity, String firstName, String lastName) {
        return new DriverApp(takenSeats, capacity, firstName, lastName);
    }

    public RiderApp createRiderApp(String firstName, String lastName) {
        return new RiderApp(firstName,lastName);
    }

    public Driver createDriver(String firstName, String lastName, Double rating) {
        Driver driver = new Driver(firstName,lastName);
        driver.setRating(rating);
        return driver;
    }

    public Location createLocation(String latitude, String longitude) {
        return new Location(latitude, longitude);
    }
}
