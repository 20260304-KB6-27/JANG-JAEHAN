package basic.ch08.ch02;

public interface RemoteControl {

    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;
    public void turnOn();
    void turnOff();
    void setVolume(int volume);
}
