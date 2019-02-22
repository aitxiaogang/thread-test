package unit_3.test2;

/**
 * @author xiaogang
 * @date 2019/2/19 18:28
 */
public class Run {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            MyThread1 t1 = new MyThread1(lock);
            MyThread2 t2 = new MyThread2(lock);
            t1.start();
            Thread.sleep(1000);
            t2.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
