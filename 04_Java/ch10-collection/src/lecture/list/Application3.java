package lecture.list;

import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class Application3 {
    public static void main(String[] args) {
        /*
        Vector
        - ArrayList 동일한 구조를 가지지만 동기화(synchronized) 메서드로 구성
        - 멀티 스레드 환경에서 Thread-safe 하게 동작 (한 번에 하나의 스레드만 접근 가능)
         */

        Vector<String> vector = new Vector<>();

        vector.add("apple");
        vector.add("banana");
        vector.add("cherry");
        vector.add("berry");
        vector.add("mango");

        System.out.println("vector = " + vector);
        System.out.println("vetor.size() = " + vector.size());
        System.out.println("vetor.get(0) = " + vector.get(0));

        /*
        Enumeration (열거자)
        - Iterator 이전의 방식 (Vector, HashTable 등 레거시 클래스에서 사용)
         */

        Enumeration<String> enumeration = vector.elements();

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        // ArrayList를 동기화 하고 싶을 때
        List<String> syncList = Collections.synchronizedList(new java.util.ArrayList<>());

    }
}
