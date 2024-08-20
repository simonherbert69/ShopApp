package duke.choice;

public class Customer {

    String name;
    String size;
    int measurement;


    final String comma = ",";
    public String toString() {

        return name + comma + size + comma + measurement;
    }
}
