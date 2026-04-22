package lecture.exam02;

public class Application3 {

    public static void main(String[] args) {

        // 상황.
        // 사용자입력문자열 => 숫자로 치환 => 배열 생성 => 특정 인덱스 출력

        String inputSize = "10";
        int inputIndex = 5;

        try {
            int size = Integer.parseInt(inputSize); // NumberFormatException
            int[] arr = new int[size]; // NegativeArraySizeException
            System.out.println(arr[inputIndex]); // ArrayIndexOutOfBoundsException
        } catch (NumberFormatException | NegativeArraySizeException e) {
            System.out.println("치환 불가 또는 음수 제시 불가");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("부적절한 인덱스 제시");
        }

        // 여러 예외 클래스 묶어서 동일한 로직으로 처리할 경우 => | (파이프 기호)로 연결

        try {
            int size = Integer.parseInt(inputSize); // NumberFormatException
            int[] arr = new int[size]; // NegativeArraySizeException
            System.out.println(arr[inputIndex]); // ArrayIndexOutOfBoundsException
        } catch (RuntimeException e) { // 공통 부모로 작성 (매개변수의 다형성, 부모 타입으로 자식 예외 객체들 다 받음)
            System.out.println("치환 불가 또는 음수 제시 불가 또는 부적절한 인덱스");
        }
        // 부모 타입 예외 클래스로 한 번에 처리 가능

        try {
            int size = Integer.parseInt(inputSize); // NumberFormatException
            int[] arr = new int[size]; // NegativeArraySizeException
            System.out.println(arr[inputIndex]); // ArrayIndexOutOfBoundsException
        } catch (RuntimeException e) { // 공통 부모로 작성 (매개변수의 다형성, 부모 타입으로 자식 예외 객체들 다 받음)
            System.out.println("치환 불가 또는 음수 제시 불가");
        }  // catch (ArrayIndexOutOfBoundsException e) { // RuntimeException 부분에서 이미 처리되는 예외로 의미가 없어서 빨간 밑줄로 나오며 에러 -> 즉 윗 블록에 위치해야함
//            System.out.println("부적절한 인덱스 제시");
//        }

        try {
            int size = Integer.parseInt(inputSize); // NumberFormatException
            int[] arr = new int[size]; // NegativeArraySizeException
            System.out.println(arr[inputIndex]); // ArrayIndexOutOfBoundsException
        }  catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("부적절한 인덱스 제시");
        }
        catch (RuntimeException e) { // 공통 부모로 작성 (매개변수의 다형성, 부모 타입으로 자식 예외 객체들 다 받음)
            System.out.println("치환 불가 또는 음수 제시 불가");
        }
        // 하위 예외 클래스 타입 아래에 상위 예외 클래스 타입이 있어야함 ( 순서 중요 )

        System.out.println("프로그램 종료");


    }

    /*
        Unchecked Exception (실행 예외)
        1. 컴파일 에러가 뜨지 않음
        2. 예외 처리 코드가 필수가 아님
            => 즉, 예외 처리 코드를 필수로 작성하지 않아도 프로그램 동작 가능
        3. 예측 가능한 상황 => 조건문으로도 핸들링 가능
        4. RuntimeException 계층
     */

}