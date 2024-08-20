package duke.choice;

public class Clothing {
    String description;
    double price;
    String size= "M";
    final String comma = ",";
    public String toString() {

        return description + comma + price + comma + size;
    }
}
