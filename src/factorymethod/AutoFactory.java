package factorymethod;

public class AutoFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Auto();
    }
}
