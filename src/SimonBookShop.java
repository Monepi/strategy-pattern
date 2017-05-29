
public class SimonBookShop extends BookShop {

    public SimonBookShop(String name, String city, String streetAddress) {
        super(name, city, streetAddress);
        stock = new OutOfStock();
    }

}
