
public class InStock implements StockAvailability {
    @Override
    public String supply() {
        return "Books available (in stock)";
    }
}
