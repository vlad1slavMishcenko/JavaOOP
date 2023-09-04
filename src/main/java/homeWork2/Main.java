package homeWork2;


public class Main {
    public static void main(String[] args) {
        Buyer buyer = new Buyer("Минералка, Колбаса");
        Buyer buyer1 = new Buyer("Булочка");
        Buyer buyer2 = new Buyer("Сыр");
        Buyer buyer3 = new Buyer("");
        Buyer buyer4 = new Buyer("Хлеб");
        Market market = new Market();
        market.order(buyer);
        market.order(buyer1);
        market.order(buyer2);
        market.order(buyer3);
        market.order(buyer4);
        buyer2.setOrder("Арбуз");
        market.order(buyer2);
        market.remove();


    }
}
