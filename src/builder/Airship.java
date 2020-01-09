package builder;

public class Airship {
    private OrbitalModulle orbitalModulle;
    private Engine engine;
    private EscapTower escapTower;

    public OrbitalModulle getOrbitalModulle() {
        return orbitalModulle;
    }

    public void setOrbitalModulle(OrbitalModulle orbitalModulle) {
        this.orbitalModulle = orbitalModulle;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapTower getEscapTower() {
        return escapTower;
    }

    public void setEscapTower(EscapTower escapTower) {
        this.escapTower = escapTower;
    }
}

class OrbitalModulle{
    private String name;

    public OrbitalModulle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Engine{
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class EscapTower{
    private String name;

    public EscapTower(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}