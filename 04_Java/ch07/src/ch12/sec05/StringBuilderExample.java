package ch12.sec05;

public class StringBuilderExample {
    public static void main(String[] args) {

        // 문자열을 반복적으로 조립할 떄 StringBuffer 를 사용해서 메모리 낭비를 줄일 수 있다.
        String data = new StringBuilder()
                .append("DEF") // Buffer에 "DEF" 추가
                .insert(0,"ABC") // 0번째 인덱스 앞에 "ABC" 추가
                .delete(3,4) // index 3부터 4전까지 삭제
                .toString(); // 문자열로 반환
    }
}
