package basic.ch18.sec06;

import java.io.*;

public class BufferStreamExample {
    public static void main(String[] args) throws Exception {

        // 기본 입출력 스트림
        FileInputStream fis = new FileInputStream("resources/fuji.png");
        FileOutputStream fos = new FileOutputStream("resources/fuji-copy.png");

        // 버퍼 입출력 스트림
        FileInputStream fis2 = new FileInputStream("resources/fuji.png");
        FileOutputStream fos2 = new FileOutputStream("resources/fuji-copy2.png");
        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        long nonBufferTime = copy(fis, fos);
        System.out.println("버퍼 미사용 : \t" + nonBufferTime );

        long bufferTime = copy(bis,bos);
        System.out.println("버퍼 사용 : \t" + bufferTime);
    }

    private static long copy(InputStream is, OutputStream os) throws IOException {

        long start = System.nanoTime();

        int data;

        while ((data = is.read()) != -1) {
            os.write(data); // 복사
        }

        os.flush();

        return System.nanoTime() - start;
    }
}
