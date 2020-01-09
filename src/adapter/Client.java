package adapter;

public class Client {
    public void test(Target t){
        t.handleRequest();
    }

    public static void main(String[] args) {
        Client c = new Client();
        Adaptee adaptee = new Adaptee();
        Target t = new Adpater2(adaptee);
        c.test(t);
    }
}
