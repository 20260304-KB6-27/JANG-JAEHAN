package basic.lecture.ch08.exam01;

public class PersonExample {
    public static void main(String[] args) {

        // 행동할 수 있는 사람
        Behavior behaviorPerson; // 인터페이스를 레퍼런스 타입으로 선언 -> X = new Behavior();
        behaviorPerson = new Student(); // (Behavior) new Student()로 하지 않아도 Student가 자식이므로 업캐스팅이 일어나 자동 형변환됨. 다운 캐스팅 시에는 명시
        behaviorPerson = new Worker(); // 교체

        behaviorPerson.eat(); // 처음엔 Behavior를 바라보지만 런타임 시점에 Student(Worker) 객체의 오버라이딩된 eat메서드가 실행이됨
        behaviorPerson.live();

        // Student 객체로 받을 경우 기본값으로 설정된 Behavior 인터페이스의 메서드가 실행됨.
        // Worker에서는 오버라이딩 했으므로 Worker 객체로 교체 시 오버라이딩된 메서드가 실행
        behaviorPerson.die();

        Behavior.born();


    }
}
