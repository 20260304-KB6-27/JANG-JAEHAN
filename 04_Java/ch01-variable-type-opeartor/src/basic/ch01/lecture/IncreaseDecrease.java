package basic.ch01.lecture;

public class IncreaseDecrease {

    public static void main(String[] args){

        // -128~127
        byte bnum = 127;

        //overflow
        // 자료형별 값의 최대 범위를 벗어나는 경우
        // sign bit를 반전시켜 최소값으로 순환시킴
        System.out.println("bnum = " + bnum++);
        System.out.println("bnum = " + bnum);
    }
}

