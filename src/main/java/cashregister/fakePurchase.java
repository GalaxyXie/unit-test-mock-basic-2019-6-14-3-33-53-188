package cashregister;

public class fakePurchase {
    private Item[] items;

    public fakePurchase(Item[] items) {

        this.items = items;
    }

    public String asString() {
        String out = "";

        for (Item item : items) {
            out += item.getName() + "\t" + item.getPrice() + "\n";
        }

        return out;
    }
}
