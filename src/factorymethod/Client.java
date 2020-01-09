package factorymethod;



public class Client {
    public static void main(String[] args) {
        Car c = new BenFactory().createCar();
        c.run();
    }


}
