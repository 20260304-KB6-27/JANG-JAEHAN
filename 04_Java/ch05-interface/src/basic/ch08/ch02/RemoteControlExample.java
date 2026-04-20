package basic.ch08.ch02;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        System.out.println();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
    }
}
