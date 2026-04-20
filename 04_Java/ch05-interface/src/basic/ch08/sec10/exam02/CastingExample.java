package basic.ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
//        vehicle.checkFare();

        Bus bus = (Bus) vehicle; // 다운 캐스팅
        bus.run();
        bus.checkFare();


    }
}
