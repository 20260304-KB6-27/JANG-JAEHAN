package lecture.command;

public class Application {

    /*
    커맨드 패턴 ( Command )
    - 요청을 객체로 만들어서 실행, 취소, 재사용을 가능하게 하는 패턴

    Command : 실행 명령 (인터페이스)
    ConcreteCommand : Command의 구현체
    Receiver : 실제 동작을 수행하는 객체
    Invoker : Command를 보관, 실행하는 객체
    Client : 실행하는 곳
     */
    public static void main(String[] args) {

        // Receiver : command의 실제 동작을 수행하는 객체
        Light livingRoomLight = new Light("거실");
        Light bathroomLight = new Light("화장실");

        // ConcreteCommand : Command의 구현체를 생성해서 Receiver를 주입
        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);

        Command bathroomLightOn = new LightOnCommand(bathroomLight);
        Command bathroomLightOff = new LightOffCommand(bathroomLight);

        // Invoker : 명령 실행기
        RemoteControl remoteControl = new RemoteControl();

        // 거실 불 켜기
        remoteControl.setCommand(livingRoomLightOn);
        System.out.println("거실불 = " + livingRoomLight);
        remoteControl.pressButton();
        System.out.println("거실불 = " + livingRoomLight);

        System.out.println();

        // 화장실 불 켜기
        remoteControl.setCommand(bathroomLightOn);
        System.out.println("화장실불 = " + bathroomLight);
        remoteControl.pressButton();
        System.out.println("화장실불 = " + bathroomLight);

        System.out.println();

        // 화장실 불 끄기
        remoteControl.setCommand(bathroomLightOff);
        System.out.println("화장실불 = " + bathroomLight);
        remoteControl.pressButton();
        System.out.println("화장실불 = " + bathroomLight);

        /*
        핵심:
        RemoteControl은 Light가 거실 불인지, 화장실 불인지 모른다.
        그저 Command를 실행할 뿐이다.

        즉,
        - Light 객체가 바뀌어도 RemoteControl은 수정하지 않아도 됨
        - 켜기/끄기 명령이 바뀌어도 setCommand()로 갈아끼우면 됨
        - 이것이 커맨드 패턴의 장점
         */
    }
}