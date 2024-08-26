package duke.choice;

import java.util.Arrays;

public class ShopApp {

    public static void main(String[] args) {
        System.out.println("tax " +  Clothing.TAX_RATE);
        System.out.println("min price " + Clothing.MIN_PRICE);
        Customer c1 = new Customer("Pinky", 14);
        Clothing item1 = new Clothing("Blue Jacket",20.9, "M");
        Clothing item2 = new Clothing("Orange t-shirt",10.5, "S");
        Clothing[] items = {item1,item2, new Clothing("Green Scarf",5.0,"S"), new Clothing("Blue T-shirt", 10.5, "S")};
        c1.addItems(items);
        System.out.println("Customer is " + c1);
        System.out.println("Items are " + Arrays.toString(items));
        System.out.println("Total is " + c1.getTotalClothingCost());

        int average =0;
        int count=0;
        for (Clothing item : c1.getItems() ) {
            if (item.getSize().equals("L")) {
                count++;
                average += item.getPrice();
            }
        }
        try {
            average = average / count;
            System.out.printf("Average Price = " + average + ", Count = " + count);
        }
        catch (ArithmeticException ae) {
            System.out.println("do not divide by 0");
        }
    }

}
