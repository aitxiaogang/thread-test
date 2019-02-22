package unit_1.t19;

/**
 * @author xiaogang
 * @date 2019/2/12 18:04
 */
public class Run {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread1.setName("a");
        MyThread2 thread2 = new MyThread2();
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread2.setName("b");
        thread2.start();
    }
}
