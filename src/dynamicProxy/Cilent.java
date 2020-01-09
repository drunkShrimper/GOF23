package dynamicProxy;

import java.lang.reflect.Proxy;

public class Cilent {
    public static void main(String[] args) {
        Star jc = new JayC();
        StarHandler handler = new StarHandler(jc);
        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Star.class},handler);

        proxy.confer();
        proxy.signContract();
        proxy.sing();
        proxy.collectionMoney();
    }
}
