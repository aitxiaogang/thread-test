package unit_1.t15;

/**
 * @author xiaogang
 * @date 2019/2/12 14:27
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        thread.interrupt();
        System.out.println("end");
    }
}
