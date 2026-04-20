package basic.lecture.ch08.exam01;

public class Worker extends Person implements Behavior {

    // 추가 필드
    String companyName;
    String position;

    @Override
    public void eat() {
        System.out.println("구내식당에서 점심을 먹습니다.");
    }

    @Override
    public void live() {
        System.out.println(OPENING_TIME + "시부터" + Behavior.CLOSING_TIME + "시까지 근무합니다.");
    }

    @Override
    public void die() {
        System.out.println("일을 제대로 안하면 대표님이 죽일 거 같아요.");
    }
}