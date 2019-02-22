package unit_4.UseConditionWaitNotifyOk;

/**
 * @author xiaogang
 * @date 2019/2/22 10:29
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        a.start();
        Thread.sleep(2000);
        myService.signal();
    }
}
