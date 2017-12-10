package Apps.shared.abstractions;

public class RideRequest {
    private String origin;
    private String destination;

    public RideRequest() {
        this.origin = "NOT SET";
        this.destination = "NOT SET";
    }

    public RideRequest(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getOriginLocation() {
        return origin;
    }

    public String getDestinationLocation() {
        return destination;
    }

    @Override
    public String toString() {
        return "RideRequest{" +
                "origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}
