package cn.itcast.jvm.t4.avo;

public class Demo4_1_1 {

    static int i = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i1 = 0; i1 < 50000; i1++) {
                i++;
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i1 = 0; i1 < 50000; i1++) {
                i--;
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(i);
    }
}
