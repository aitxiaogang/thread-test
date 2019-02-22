package unit_1.t7;

/**
 * @author xiaogang
 * @date 2019/2/11 16:26
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        System.out.println("myThread.isAlive() = " + myThread.isAlive());
        myThread.start();
        Thread.sleep(1000);
        System.out.println("myThread.isAlive()  end = " + myThread.isAlive());
    }
}
