package singleton;
//饿汉式单例  线程安全，调用效率高
public class Singleton1 {

    private Singleton1(){}

    public static Singleton1 s = new Singleton1();//类初始化时，立即加载这个对象

    public static Singleton1 getS() {
        return s;
    }
}
