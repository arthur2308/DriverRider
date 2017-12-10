package Apps.DriverApp;

import Apps.RiderApp.Rider;

import java.util.ArrayList;
import java.util.List;

public class Car extends Apps.shared.abstractions.Car {
    private Integer takenSeats;
    private Integer carCapacity;
    private List<Rider> riders;

    public Car() {
        this.takenSeats = 0;
        this.carCapacity = 4;
        this.riders = new ArrayList<>();
    }

    public Car(int takenSeats, int carCapacity) {
        this.takenSeats = takenSeats;
        this.carCapacity = carCapacity;
        this.riders = new ArrayList<>();
    }

    public Boolean addPassenger(Rider rider) {
        if(takenSeats < carCapacity)
            return riders.add(rider);
        else System.out.println("Car full");

        return false;
    }

    public Boolean dropOff(Rider rider) {
        return riders.remove(rider);
    }

    public Integer getTakenSeats() {
        return takenSeats;
    }

    public void setTakenSeats(Integer takenSeats) {
        this.takenSeats = takenSeats;
    }

    public Integer getCarCapacity() {
        return carCapacity;
    }

    public void setCarCapacity(Integer carCapacity) {
        this.carCapacity = carCapacity;
    }

    public List<Rider> getRiders() {
        return riders;
    }

    public void setRiders(List<Rider> riders) {
        this.riders = riders;
    }
}
