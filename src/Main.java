
public class Main {

    public static void main(String[] args) {

        BookShop simon = new SimonBookShop("Simon Books", "Nelspruit",
                "123 corner Javascript and Java");

        BookShop mpho = new MphoBookShop("Mpho Books", "Mosel Bay",
                "5 corner Android and Lost world");

        System.out.println(simon.getBookShopDescription());
        System.out.println("Simon : " + simon.checkStock());

        System.out.println(mpho.getBookShopDescription());
        System.out.println("Mpho : " + mpho.checkStock());
        simon.setStock(new InStock());
        System.out.println(simon.getBookShopDescription());
        System.out.println("Simon : " + simon.checkStock());

    }

}
