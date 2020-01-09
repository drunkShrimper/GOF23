package observer2;


public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        MyObserver obs1 = new MyObserver();
        MyObserver obs2 = new MyObserver();
        MyObserver obs3 = new MyObserver();

        subject.addObserver(obs1);
        subject.addObserver(obs2);
        subject.addObserver(obs3);

        subject.set(5556);

        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());
    }
}
