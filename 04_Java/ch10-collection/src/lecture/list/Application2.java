package lecture.list;

import java.util.Stack;

public class Application2 {
    public static void main(String[] args) {

        /*
        Stack
        - 선형 메모리 공간에 데이터를 저장하며 후입 선출(LIFO) 방식의 자료구조
         */

        Stack<Integer> intgerStack = new Stack<>();

        intgerStack.push(1);
        intgerStack.push(2);
        intgerStack.push(3);
        intgerStack.push(4);
        intgerStack.push(5);

        System.out.println(intgerStack);

        // peek() : 가장 상단(마지막에 들어온) 요소 반환
        // pop() : 가장 상단(마지막에 들어온) 요소 반환 후 제거

//        System.out.println("intgerStack.peek = " + intgerStack.peek());
//        System.out.println("intgerStack.pop() = " + intgerStack.pop());
//        System.out.println("intgerStack.push() = " + intgerStack.peek());

        // search() : 요소 찾기 위에서부터의 순번을 의미 (1부터 시작)
        System.out.println("intgerStack.search(3) = " + intgerStack.search(3));

        // 다 비어 있을 때는 예외 발생 EmptyStackException
        System.out.println("intgerStack.pop() = " + intgerStack.pop());
        System.out.println("intgerStack.pop() = " + intgerStack.pop());
        System.out.println("intgerStack.pop() = " + intgerStack.pop());
        System.out.println("intgerStack.pop() = " + intgerStack.pop());
        System.out.println("intgerStack.pop() = " + intgerStack.pop());


    }

}
