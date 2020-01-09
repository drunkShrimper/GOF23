package adapter;

public class Adpater extends Adaptee implements Target {

    @Override
    public void handleRequest() {
        super.request();
    }
}
