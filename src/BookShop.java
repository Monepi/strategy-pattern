
public class BookShop {

    protected String name;
    protected String city;
    protected String streetAddress;

    StockAvailability stock;

    public BookShop(String name, String city, String streetAddress) {
        this.name = name;
        this.city = city;
        this.streetAddress = streetAddress;
    }

    protected void setStock(StockAvailability newStock) {
        stock = newStock;
    }

    protected String checkStock() {
        return  stock.supply();
    }

    protected String getBookShopDescription() {
        return "Bookshop Name : " + this.name + ", City: " + this.city + ", Address : " + this.streetAddress;
    }

}
