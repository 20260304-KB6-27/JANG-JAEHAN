package baisc.ch14.lecture.synchronization;

import javax.print.attribute.standard.RequestingUserName;


public class Application {
    public static void main(String[] args) {

//        Account account = new Account();

        SafeAccount account = new SafeAccount(); // 동기화 적용
        System.out.println(account.getBalance());

        // 작업 스레드 정의
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run () {
                account.withdraw(300);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run () {
                account.withdraw(200);
            }
        });

        t1.start(); // 작업 스레드가 실행
        t2.start(); // 작업 스레드가 실행

//        System.out.println("안녕"); // 메인 스레드가 실행

        // 메인 스레드
//        account.withdraw(100);
//        account.withdraw(100);
//        account.withdraw(100);
    }
}
