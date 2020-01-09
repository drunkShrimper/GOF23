package dynamicProxy;

public class JayC implements Star {
    @Override
    public void confer() {
        System.out.println("JayC confer");
    }

    @Override
    public void signContract() {
        System.out.println("JayC signContract");
    }

    @Override
    public void sing() {
        System.out.println("JayC singing");
    }

    @Override
    public void collectionMoney() {
        System.out.println("JayC collectionMoney");
    }
}
