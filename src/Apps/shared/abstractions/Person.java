package Apps.shared.abstractions;

public abstract class Person {
    private String firstName;
    private String lastName;
    private Double rating;
    private Boolean driver;

    public Person(Boolean driver) {
        this.driver = driver;
    }

    public Person(String firstName, String lastName, Boolean driver) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rating = 5.0;
        this.driver = driver;
    }

    public String getName() {
        return "First Name: " + firstName + "\nLast Name: " + lastName;
    }

    public Double getRating() {
        return rating;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Boolean getDriver() {
        return driver;
    }

    @Override
    public String toString() {
        return "RIDER\n\t\tFIRST NAME: "+ firstName + "\n\t\t"+"LAST NAME: " + lastName + "\n\t\t"+"RATING: " + rating;
    }
}
