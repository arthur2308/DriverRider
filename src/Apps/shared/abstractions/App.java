package Apps.shared.abstractions;

public abstract class App {

    public Location getCurrentLocation() {
        String latitude = "12";
        String longitude = "23423";
        return new Location(latitude,longitude);
    }
}
