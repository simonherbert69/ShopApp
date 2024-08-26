package duke.choice;

public class Customer {

    String name = "Mary";
    String size;
    int measurement;
    private Clothing[] items;

    public Customer(String name, int measurement) {
        this.name=name;
        setSize(measurement);
    }

    public String getSize() {
        return size;
    }

    public void addItems(Clothing[] items) {
        this.items = items;
    }

    public Clothing[] getItems() {
        return items;
    }

    public double getTotalClothingCost() {
        double total = 0;

        for (Clothing item : items) {
                total = total + item.getPrice();

        }
        return total;
    }

    public void setSize(String size) {
        this.size = size;
    }

   public void setSize(int measurement) {
       switch (measurement) {
           case 1:
           case 2:
           case 3 :
               setSize("S");
               break;
           case 4,5,6 :
               setSize("M");
               break;
           case 7,8,9 :
               setSize("L");
               break;
           default:
               setSize("XL");

       }
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMeasurement() {
        return measurement;
    }

    public void setMeasurement(int measurement) {
        this.measurement = measurement;
    }


    public String toString() {

        String comma = ",";
        return name + comma + size + comma + measurement;
    }
}
