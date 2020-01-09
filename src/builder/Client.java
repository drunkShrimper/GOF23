package builder;

public class Client {

    public static void main(String[] args) {
        AirshipDirector director = new MyAirshipDirector(new MyAirshipBuilder());
        Airship ship = director.directAirhsip();
        System.out.println(ship.getEngine().getName());
    }
}
