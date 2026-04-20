package basic.lecture.ch08.exam01;

/*
인터페이스
1. 기본적으로 추상 메서드와 상수 필드만 가질 수 있는 클래스의 변형체
    => 필드 작성 시 묵시적으로 public static final
    => 메서드 작성 시 묵시적으로 public abstract
2. 클래스에서 인터페이스 구현 시 implements 키워드 사용
 */

public interface Behavior {

    // x 일반 필드 불가
    // private int num;

    // o 상수 필드 가능
    /* public static final */ int OPENING_TIME = 9;
    /* public static final */ int CLOSING_TIME = 18;

    // x 일반 메서드 불가
    // public void basicMethod() { ... ;}

    // o 추상 메서드 가능
    /* public abstract */ void eat();
    /* public abstract */ void live();

    // void die();
    // default 접근 제한자가 아니라 예약어임 default 접근 제한자는 생략으로 사용함
    // o default 메서드로 구현부가 정의되어 있는 메서드 정의 가능 ( 완성형 메서드 )
    // -> 모든 하위 클래스가 아니라 사용하려고하는 일부 클래스에만 적용하기 쉽게 하기 위함 => 선택적으로 오버라이딩 가능
    default void die() {
        System.out.println("우리는 언제가 죽게 돼있습니다.");
    }

    // o static 메서드로 공통 메서드 정의 가능 (오버라이딩 X) - 구현 클래스에서 오버라이딩 불가능
    static void born() {
        System.out.println("우리는 모두 엄마 뱃속에서 태어납니다.");
    }


}
