
public class MphoBookShop extends BookShop {

    public MphoBookShop(String name, String city, String streetAddress) {
        super(name, city, streetAddress);
        stock = new InStock();
    }

}
