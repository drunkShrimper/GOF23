package factorymethod;

public class BenFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Ben();
    }
}
