package duke.choice;

public class Clothing {
    public final static double MIN_PRICE = 10;
    public final static double TAX_RATE =  0.2;

    String description;
    double price;
    String size= "M";

    public Clothing(String description, double price, String size) {
        setDescription(description);
        setPrice(price);
        setSize(size);
    }

    public double getPrice() {
        return price * (1 + TAX_RATE);
    }

    public void setPrice(double price) {
        this.price = Math.max(price, MIN_PRICE);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String toString() {

        String comma = ",";
        return description + comma + price + comma + size;
    }
}
