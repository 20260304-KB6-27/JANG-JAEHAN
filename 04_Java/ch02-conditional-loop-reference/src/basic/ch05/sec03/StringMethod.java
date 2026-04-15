package basic.ch05.sec03;

public class StringMethod {
    public static void main(String[] args) {

        String subject = "자바 프로그래밍";

        // length() : 길이 반환 메서드
        System.out.println(subject.length());

        // indexOf()
        // 처음 등장하는 위치의 인덱스를 반환
        // 찾으면 시작하는 인덱스를 반환, 못 찾으면 -1 반환
        int location = subject.indexOf("프로그래밍");
        System.out.println("location = " + location);

        // split
        // 문자열을 특정 구분자를 기준으로 잘라 문자열 배열로 반환
        // - 정규식을 구분자로 사용 가능

        String[] splitstr = subject.split(" ");
        // array length
        System.out.println(splitstr.length);
        System.out.println(splitstr[0]);
        System.out.println(splitstr[1]);

        /*
        substring
        - 원하는 범위만 잘라서 새로운 문자열을 반환

        - 인자가 1개일 때
            - 해당 인덱스 부터 끝까지 반환

        - 인자가 2개일 때
            - 시작 인덱스부터 끝 인덱스의 전까지 문자열을 반환
         */

        String subString = subject.substring(location);
        System.out.println(subString);
        String subString2 = subject.substring(location,location+2);
        System.out.println(subString2);

        /*
        replace(target, replacement)

        - target 바꿀 대상
        - replacement 바꿀 값
         */

        String replaceStr = subject.replace("래밍","램");
        System.out.println(replaceStr);
    }
}

