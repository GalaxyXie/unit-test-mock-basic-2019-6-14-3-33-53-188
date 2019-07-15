package cashregister;

public class fakePurchase extends Purchase{
    private String StringIWanted;

    public fakePurchase(Item[] items) {
        super(items);
    }


    public String getStringIWanted() {
        return StringIWanted;
    }

    public void setStringIWanted(String stringIWanted) {
        StringIWanted = stringIWanted;
    }
    public String asString() {
       return this.getStringIWanted();
    }
}
