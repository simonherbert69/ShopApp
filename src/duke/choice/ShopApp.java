package duke.choice;

public class ShopApp {

    String firstName= "Mary";
    int c = 25 -5 * 4 / 2 - 10 + 4;
    int c2 = (((25 -5) * 4) / (2 - 10)) + 4;
    double tax = 0.2;

    public static void main(String[] args) {
        ShopApp sa = new ShopApp();
        sa.firstName = "Gary";
        System.out.println("Welcome to Duke Choice Shop " + sa.firstName);
        Customer c1 = new Customer();
        c1.name="Pinky";
        c1.measurement = 1;

        switch (c1.measurement) {
            case 1: case 2: case 3 :
                c1.size="S";
                break;
            case 4,5,6 :
                c1.size="M";
                break;
            case 7,8,9 :
                c1.size = "L";
                break;
            default:
                c1.size="X";

        }
        System.out.println("Customer is " + c1);
        System.out.println("c is " + sa.c);
        System.out.println("c2 is " + sa.c2);

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        item1.description="Blue Jacket";
        item1.price = 20.9;
        item2.description="Orange t-shirt";
        item2.price = 10.5;
        item2.size = "S";
        System.out.println("item1 is " + item1);
        System.out.println("item2 is " + item2);


        Clothing[] items = {item1,item2};

        double total = (2 * items[1].price) + items[0].price;
        System.out.println("Total is " + (total + total * sa.tax));



    }

}
