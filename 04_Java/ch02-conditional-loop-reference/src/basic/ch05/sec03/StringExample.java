package basic.ch05.sec03;

public class StringExample {
    public static void main(String[] args) {

        // String 객체 타입
        String str1 = "hello";

        // 2. String 불변 객체
        // -> 기존 값이 변경되지 않고 새로운 객체가 생성됨
        String str2 = "hello";
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        String str3 = new String("hello");
        System.out.println(System.identityHashCode(str3));


        // 문자열 풀에 있는 같은 주소를 비교하게 됨 (두 변수가 같은 hello를 참조)ㄴ
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        // 문자열 값 자체를 비교
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        str1 = str1 + "world!";

        System.out.println(str1);

        // System.identityHashCode : 코드 상에서 주소값을 보는 메소드 (실제 주소값은 아님)
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        System.out.println(str1 == str2);

    }
}

