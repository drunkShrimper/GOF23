package builder;

public class MyAirshipBuilder implements AirshipBuilder {
    @Override
    public Engine buildEngin() {
        return new Engine("引擎");
        //这里可以不采用new 而采用工厂模式，由factory创建对象
    }

    @Override
    public EscapTower buildEscapTower() {
        return new EscapTower("逃生舱");
    }

    @Override
    public OrbitalModulle buildOrbitalModulle() {
        return new OrbitalModulle("轨道舱");
    }
}
