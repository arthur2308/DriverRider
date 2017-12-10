import Apps.DriverApp.Driver;
import Apps.DriverApp.DriverApp;
import Apps.RiderApp.Rider;
import Apps.RiderApp.RiderApp;
import Apps.ServerApp.ServerApp;
import Apps.shared.abstractions.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Factory factory = new Factory();
        ServerApp serverApp = ServerApp.getUniqueInstance();

        System.out.println("Enter riders first name\n" +
                "Enter riders last name");

        RiderApp riderApp = factory.createRiderApp(kb.nextLine(),kb.nextLine());

        System.out.println("Enter drivers car takenSeats\n" +
                "Enter drivers car seat capacity\n" +
                "Enter drivers first name\n" +
                "Enter drivers last name");

        DriverApp driverApp = factory.createDriverApp(kb.nextInt(),kb.nextInt(),kb.nextLine(),kb.nextLine());

        serverApp.registerNewPerson(driverApp.getDriver());
        serverApp.registerNewPerson(riderApp.getRider());

        System.out.println("Enter from location\n" +
                "Enter to location");
        serverApp.handleRideRequest(riderApp.requestRide(kb.nextLine(),kb.nextLine()));

        System.out.println(riderApp.getRideRequest().toString());

        System.out.println("=================== CARS NEARBY ===================\n" +
                "LICENSE\t\tMAKE\t\tMODEL\t\tCURRENT LOCATION");
        for(Car car: riderApp.fetchNearbyCars())
            System.out.println(car.toString());

        System.out.println(riderApp.toString());
        System.out.println(driverApp.toString());
    }
}
