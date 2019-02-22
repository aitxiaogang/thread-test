package unit_1.daemonThread;

/**
 * @author xiaogang
 * @date 2019/2/13 14:54
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        //设置myThread为守护线程，那么这个程序中就全都是守护线程，虽然myThread这个守护线程还没有结束，但是
        //jvm的gc守护线程已经结束了，所以myThread这个线程也随之结束
        myThread.setDaemon(true);
        myThread.start();
        myThread.sleep(5000);
        System.out.println("我离开thread对象也不再打印了，程序终止");
    }
}
