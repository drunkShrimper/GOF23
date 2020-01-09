package singleton;
//懒汉式单例  线程安全，需要使用时创建对象，懒加载的思想
public class Singleton2 {

    private Singleton2(){}

    public static Singleton2 s;

    public static synchronized Singleton2 getS() {
        if(s == null){
            s = new Singleton2();//使用时创建对象
        }
        return s;
    }
}
