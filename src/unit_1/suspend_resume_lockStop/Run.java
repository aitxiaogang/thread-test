package unit_1.suspend_resume_lockStop;

/**
 * @author xiaogang
 * @date 2019/2/12 16:00
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        thread.start();
        //当前线程休眠1秒
        Thread.sleep(1000);
        thread.suspend();
        System.out.println("main end");
    }
}
