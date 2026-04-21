package lecture.exam02;

public class PostExample {
    public static void main(String[] args) {
        // 정적 중첩 객체인 경우 외부 객체를 먼저 생성할 필요 x
        PostResponse.Author author = new PostResponse.Author("자바왕", "java@java.com");
    }

    // 빌더 패턴 ****
}
