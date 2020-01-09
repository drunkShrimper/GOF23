package builder;

public class MyAirshipDirector implements AirshipDirector{
    private AirshipBuilder builder;

    public MyAirshipDirector(AirshipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public Airship directAirhsip() {
        Engine e = builder.buildEngin();
        OrbitalModulle o = builder.buildOrbitalModulle();
        EscapTower et = builder.buildEscapTower();

        Airship ship = new Airship();
        ship.setEngine(e);
        ship.setEscapTower(et);
        ship.setOrbitalModulle(o);

        return ship;
    }
}
