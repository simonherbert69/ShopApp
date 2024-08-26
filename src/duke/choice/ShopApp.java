package duke.choice;

import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class ShopApp {

    public static void main(String[] args) {
        System.out.println("tax " +  Clothing.TAX_RATE);
        System.out.println("min price " + Clothing.MIN_PRICE);
        Customer c1 = new Customer("Pinky", 14);
        Clothing item1 = new Clothing("Blue Jacket",20.9, "M");
        Clothing item2 = new Clothing("Orange t-shirt",10.5, "S");
        Clothing[] items = {item1,item2, new Clothing("Green Scarf",5.0,"S"), new Clothing("Blue T-shirt", 10.5, "S")};
        c1.addItems(items);

        try {
            ItemList list = new ItemList(items);
            Routing routing = Routing.builder().get("/items", list).build();
            ServerConfiguration config = ServerConfiguration.builder()
                    .bindAddress(InetAddress.getLocalHost())
                    .port(8889).build();
            WebServer ws = WebServer.create(config,routing);
            ws.start();
        }
        catch (UnknownHostException uhe) {
            uhe.printStackTrace();
        }
    }
}
