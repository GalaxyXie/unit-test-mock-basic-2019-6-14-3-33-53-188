package cashregister;

public class FakePurchase extends Purchase{
    private String StringIWanted;

    public FakePurchase(Item[] items) {
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
