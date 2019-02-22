package unit_1.t13;

/**
 * @author xiaogang
 * @date 2019/2/12 11:46
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();


        Thread t1 = new Thread(thread,"t1");
        Thread t2 = new Thread(thread,"t2");
        //启动线程
        t1.start();
        t2.start();
        Thread.sleep(1);
        //标记线程为停止状态
        t1.interrupt();
    }
}
