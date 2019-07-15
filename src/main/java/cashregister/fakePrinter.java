package cashregister;

public class fakePrinter extends Printer{
    private boolean isCalled;
    private String text;

    public String getText() {
        return text;
    }

    @Override
    public void print(String printThis) {
        this.setCalled(true);
        this.text=printThis;
    }
    public boolean isCalled() {
        return isCalled;
    }
    public void setCalled(boolean called) {
        isCalled = called;
    }
}
