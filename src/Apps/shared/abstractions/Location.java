package Apps.shared.abstractions;

public class Location {
    private String latitude;
    private String longitude;

    public Location (String latitude, String longitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "LOCATION" + "\n\t\tLATITUDE: " + latitude + "\n\t\tLONGITUDE: " + longitude;
    }
}
