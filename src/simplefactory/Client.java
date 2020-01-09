package simplefactory;

public class Client {
    public static void main(String[] args) {
        Car c = CarFactory.creatCar("Auto");
        c.run();
    }


}
