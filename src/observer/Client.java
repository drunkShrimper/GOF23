package observer;



public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        MyObserver obs1 = new MyObserver();
        MyObserver obs2 = new MyObserver();
        MyObserver obs3 = new MyObserver();

        subject.registerObserver(obs1);
        subject.registerObserver(obs2);
        subject.registerObserver(obs3);

        subject.setState(555);

        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());
    }
}
