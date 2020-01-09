package staticProxy;

public class staticProxy implements Star{
    private Star star;

    public staticProxy(Star star) {
        this.star = star;
    }

    @Override
    public void confer() {
        System.out.println("StarHandler confer");
    }

    @Override
    public void signContract() {
        System.out.println("StarHandler signContract");
    }

    @Override
    public void sing() {
        star.sing();
    }

    @Override
    public void collectionMoney() {
        System.out.println("StarHandler collectionMoney");
    }
}
