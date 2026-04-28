package lecture.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Application2 {
    public static void main(String[] args) {
        /*
        Dequq (덱)
        - Queue를 확장한 인터페이스로 양쪽 끝에서 모두 삽입/삭제 가능

        주요 메서드
        - offerFirst() / offerLast()
        - peekFirst() / peekLast()
        - pollFirst() / pollLast()
         */

        Deque<String> deque = new ArrayDeque<>();

        deque.offerLast("middle");
        deque.offerFirst("front");
        deque.offerLast("end");

        System.out.println("deque = " + deque);

        System.out.println("deque.peekFirst() = " + deque.peekFirst());
        System.out.println("deque.peekLast() = " + deque.peekLast());

        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println("deque = " + deque);
        System.out.println("dequq.pollLast() = " + deque.pollLast());
        System.out.println("deque = " + deque);




    }
}
