package adapter;

public class Adpater2 implements Target {

    private Adaptee adaptee;

    public Adpater2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    @Override
    public void handleRequest() {
        adaptee.request();
    }
}
