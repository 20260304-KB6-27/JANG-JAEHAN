package advanced.ch07.exam;

public class FileDownloadServlet extends HttpServlet {

    // 파일 다운로드 기능
    @Override
    public void service() {
        System.out.println("파일을 다운로드합니다.");
    }
}
