package basic.ch13.sec01;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void boxing() {

        // Box 인스턴스
    }

    /*
    데이터 형식에 의존하지 않고 하나의 값이 여러 데이터 타입을 가질 수 있어
    재사용성이 높은 프로그래밍을 할 수 있다.
     */
    public static void main(String[] args) {

        Box<String> box1 = new Box<String>(); // content의 타입은 String -> 컴파일됐을 때
        // Box<String> box1 = new Box<>(); // 앞에서 명시해두면 뒤에서 빼도 됨
        box1.content = "박스의 컨텐츠입니다.";

//        List<String> list = new ArrayList<>(); // 제네릭, 다형성 (arraylist인데 list 타입으로 받음)

        System.out.println("box1 = " + box1.content);

        Box<Integer> box2 = new Box<Integer>(); // content의 타입은 Integer -> 컴파일됐을 때
        box2.content = 100;
        System.out.println("box2 = " + box2.content);

    }
}
