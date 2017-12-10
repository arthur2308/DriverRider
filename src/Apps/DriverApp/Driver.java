package Apps.DriverApp;

import Apps.shared.abstractions.Person;

public class Driver extends Person {

    private Boolean availability;

    public Driver() {
        super("Vin","Diesel",true);
        this.availability = true;
    }

    public Driver(String firstName, String lastName, Boolean availability) {
        super(firstName, lastName, true);
        this.availability = availability;
    }

    public Driver(String firstName, String lastName){
        super(firstName,lastName,true);
    }

    public Boolean getLookingForRides() {
        return availability;
    }
}
