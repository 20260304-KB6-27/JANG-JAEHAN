package lecture.lambda.section01;

public class Application2 {
    public static void main(String[] args) {

        OuterCalculator.Sum sum = (x, y) -> x+y;
        OuterCalculator.Minus minus = (x, y) -> x-y;
        OuterCalculator.Multiple multiple = (x, y) -> x*y;
        OuterCalculator.Devide devide = (x, y) -> x/y;
    }
}
