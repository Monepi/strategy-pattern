
public class OutOfStock implements StockAvailability {
    @Override
    public String supply() {
        return "Books not available (out of stock)";
    }
}
