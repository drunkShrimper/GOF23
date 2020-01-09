package staticProxy;

public class Client {
    public static void main(String[] args) {
        Star jc = new JayC();
        Star proxy = new staticProxy(jc);

        proxy.confer();
        proxy.signContract();
        proxy.sing();
        proxy.collectionMoney();
    }
}
