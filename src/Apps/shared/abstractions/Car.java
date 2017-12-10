package Apps.shared.abstractions;

public abstract class Car {
    private String licensePlate;
    private String make;
    private String model;
    private Location currentLocation = new Location("4231","432");

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String toString() {
        return licensePlate + "\t\t" + make + "\t\t" + model + "\t\t" + currentLocation + "\t\t";
    }
}
