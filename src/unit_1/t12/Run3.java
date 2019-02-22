package unit_1.t12;

/**
 * @author xiaogang
 * @date 2019/2/12 10:03
 */
public class Run3 {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
        System.out.println("是否停止 1 ？ ="+thread.isInterrupted());
        System.out.println("是否停止 2 ？ ="+thread.isInterrupted());
        System.out.println("end");
    }
}
