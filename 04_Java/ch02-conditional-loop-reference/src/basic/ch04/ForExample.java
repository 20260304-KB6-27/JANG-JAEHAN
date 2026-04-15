package basic.ch04;

public class ForExample {
    public static void main(String[] args) {

        // for(초기값; 조건식; 증감식;) {}
        for (int i = 1; i <= 9; i++) {
        //  System.out.println(i);
            if (i % 2 != 0) {
                // 짝수가 아닐 때 동작


                // 이번 회차 반복만 건너뜀
                continue;
            }
            System.out.println(i);

        }


    }
}
