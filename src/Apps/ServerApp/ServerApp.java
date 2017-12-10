package Apps.ServerApp;

import Apps.shared.abstractions.Person;
import Apps.shared.abstractions.RideRequest;

import java.util.LinkedList;
import java.util.Queue;

public class ServerApp {
    private Queue<RideRequest> rideRequests;
    private Queue<Person> drivers;
    private Queue<Person> riders;

    private static ServerApp uniqueInstance;

    public static synchronized ServerApp getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ServerApp();
        }
        return uniqueInstance;
    }

    public ServerApp() {
        rideRequests = new LinkedList<>();
        drivers = new LinkedList<>();
        riders = new LinkedList<>();
    }

    public Person handleRideRequest(RideRequest rideRequest) {
        //Find optimal driver
        rideRequests.add(rideRequest);
        return drivers.peek();
    }

    public Boolean registerNewPerson(Person person){
        return (person.getDriver()) ? drivers.add(person) : riders.add(person);
    }
}
