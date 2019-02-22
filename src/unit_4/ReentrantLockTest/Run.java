package unit_4.ReentrantLockTest;

/**
 * @author xiaogang
 * @date 2019/2/21 18:46
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThread a = new MyThread(myService);
        MyThread a2 = new MyThread(myService);
        MyThread a3 = new MyThread(myService);
        MyThread a4 = new MyThread(myService);
        MyThread a5 = new MyThread(myService);
        a.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();
    }
}
