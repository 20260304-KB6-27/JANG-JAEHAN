package advanced.ch07.exam;

public class HttpServletExample {
    public static void main(String[] args) {

        //    o                 //             x
        // HttpServelt servlet; //     = new HttpServlet(); // Httpservelt은 추상 클래스로 객체 생성이 불가. (레퍼런스 타입으로는 사용 가능)

        method(new LoginServlet()); // 로그인합니다.
        method(new FileDownloadServlet()); // 파일 다운로드합니다.

    }
    public static void method(HttpServlet servlet) {
        servlet.service(); // 동적 바인딩
    } // 매개변수의 다형성 : 매개변수 대입 시 HttpServlet(부모) 타입으로 자동 타입 변환
}
