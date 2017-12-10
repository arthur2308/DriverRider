package Apps.DriverApp;

import Apps.RiderApp.Rider;
import Apps.shared.abstractions.App;
import Apps.ServerApp.ServerApp;

public class DriverApp extends App {
    private Car car;
    private Driver driver;

    public DriverApp() {
        this.car = new Car();
        this.driver = new Driver();
    }

    public DriverApp(int takenSeats, int carCapacity, String firstName, String lastName) {
        this.car = new Car(takenSeats,carCapacity);
        this.driver = new Driver(firstName,lastName);
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Driver getDriver() {
        return driver;
    }

    public Boolean addRider(Rider rider) {
        return car.addPassenger(rider);
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
        ServerApp serverApp = new ServerApp();
        serverApp.registerNewPerson(driver);
    }

    @Override
    public String toString() {
        return "DriverApp{" +
                "car=" + car.toString() +
                ", driver=" + driver.toString() +
                '}';
    }
}
