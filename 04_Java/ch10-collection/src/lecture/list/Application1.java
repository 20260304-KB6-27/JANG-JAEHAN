package lecture.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        /*
        컬렉션 프레임워크는 크게 두가지로 나뉨

        - Collection 계열 (값만 저장)
        - List 인터페이스
            - 순서가 있음, 중복 허용
            - ArrayList, LinkedList, Stack, Vector

        - Set 인터페이스
            - 순서가 없음, 중복 안됨
            - HashSet, TreeSet

        - Queue 인터페이스
            - FIFO(선입선출) 구조
            - 순서가 있음, 중복 허용 (데이터의 삽입, 삭제가 한 방향에서 이루어짐)
            - PriorityQueue, ArrayQueue, LinkedList


        - Map 계열 (Key, Value 저장)
            - 키와 값이 한 쌍으로 이루어진 데이터
            - 키는 중복 불가, 값은 중복 가능
         */

        List<String> stringList = new ArrayList<>();

        stringList.add("list");
        stringList.add("set");
        stringList.add("queue");
//
//        // List가 변경이 불가능함
//        List<String> stringList2 = List.of("list","set","queue");
//        // stringList2.add("test"); -> 에러남
//
//        List<String> stringList3 = new ArrayList<>(List.of("list","set","queue"));
//        stringList3.add("Test");
//        System.out.println("stringList3 = " + stringList3);

        /*
        Iterator (반복자)
        - 컬렉션에 저장된 요소를 순차적으로 읽어오기 위한 방법
         */

        Iterator<String> iterator = stringList.iterator(); // Iterator 객체 생성

        /*
        hasNext() : 다음 요소가 남아있으면 true, 없으면 false
        next() : 커서를 다음 요소로 이동하고 해당 요소를 반환
         */


        // "list", "set", "queue"
//        while (iterator.hasNext()) {
//            String str = iterator.next();
//            System.out.println(str);
//        }

        // 향상된 for 문 : 내부적으로는 Iterator 사용
//        for (String str : stringList) {
//            if(str.length() < 5) {
//                stringList.remove(str);
//            }
//        }

        /*
        컬렉션의 수정횟수를 기록
        modCount : 컬렉션이 변경될 때마다 증가

        expectedModcount : Iterator가 생성될 때의 modCount의 값
         */

        while (iterator.hasNext()) {
            String str = iterator.next();
            if(str.length() < 5) {
                iterator.remove(); // 커서 기준으로 삭제
            }
        }
        System.out.println("결과 : " + stringList);
    }

}
