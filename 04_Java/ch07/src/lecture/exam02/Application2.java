package lecture.exam02;

public class Application2 {

    /*
        예외처리방법1. try-catch
        발생되는 예외를 직접 처리하는 방법

        try {
            // 예외가 발생될 수 있는 구문
        } catch(예외클래스 매개변수) {
            // 해당 예외 발생시 실행(처리)할 구문

            // 매개변수: 발생된 예외 정보가 담겨있는 예외객체가 전달됨
            //         => 예외정보 사용 가능
        } [finally {
            // 예외 발생 여부를 떠나 반드시 마지막에 실행할 구문 작성
        }]
     */

    public static void main(String[] args) {

        String inputStr = "23";

        // if (inputStr이 숫자로만 이루어진 문자열일 때) // 조건문으로 예외를 방지하기 어려움

        int num = 0;

        try {
            num = Integer.parseInt(inputStr); // int num = ~ ; 으로 하면 try 블록 안에서만 num을 쓸 수 있으므로 num을 출력하려면 출력문을 try 블록 내에 위치시켜야함
        } catch (NumberFormatException e) {
            // System.out.println("에러 발생 : " + e.getMessage());
            System.out.println("숫자로 치환 불가");
        }

        System.out.println("num: " + num);

        System.out.println("프로그램 종료");

    }
}