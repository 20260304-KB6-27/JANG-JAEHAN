package lecture.exam02;

/*
시나리오. 게시판 API 응답 데이터를 담기 위한 클래스

게시글 정보 + 작성자
 */

public class PostResponse {

    // 게시글 정보
    private String title;
    private String content;
    // ...

    // 작성자 정보
    // private String name;
    // private String email;
    // ...

    // 1) 논리적으로 그룹화 시키고 싶음 (Grouping) => Author 클래스를 따로 만들면됨
    // 2) 프론트엔드와의 통신에 있어서 json의 계층적 구조화
    // 3) Author 클래스 외부로 둘 시 => 댓글 작성자는 ? (Commnet Author) 이메일 작성자는 ? (EmailAuthor) 처럼 여러 클래스가 필요할 것

    // 해결. 정적 내부 클래스 (static인 이유 - 외부에 의존하지 않는 독립적인 데이터 묶음)
    static class Author {
        private String name;
        private String email;

        public Author(String name, String email) {
            this.name = name;
            this.email = email;
        }
    }

}
