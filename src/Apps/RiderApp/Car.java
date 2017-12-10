package Apps.RiderApp;

import Apps.DriverApp.Driver;

public class Car extends Apps.shared.abstractions.Car {

    private Driver driver;

    public Car() {
        this.driver = new Driver();
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
