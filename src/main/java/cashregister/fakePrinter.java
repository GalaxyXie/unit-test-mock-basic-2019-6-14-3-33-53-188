package cashregister;

public class fakePrinter extends Printer{
    private boolean isCalled;
    @Override
    public void print(String printThis) {
        this.setCalled(true);

    }

    public boolean isCalled() {
        return isCalled;
    }

    public void setCalled(boolean called) {
        isCalled = called;
    }
}
