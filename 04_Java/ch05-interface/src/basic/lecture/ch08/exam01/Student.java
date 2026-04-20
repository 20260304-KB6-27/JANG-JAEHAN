package basic.lecture.ch08.exam01;

public class Student extends Person implements Behavior {

    // 추가 필드
    String schoolName;
    int grade;

    @Override
    public void eat() {
        System.out.println("학교에서 급식을 먹습니다.");
    }

    @Override
    public void live() {
        System.out.println(Behavior.OPENING_TIME + "시부터 " + Behavior.CLOSING_TIME + "시까지 수업을 듣습니다.");
    }
}
