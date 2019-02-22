package unit_4.UseConditionWaitNotifyOk;

/**
 * @author xiaogang
 * @date 2019/2/22 10:26
 */
public class ThreadA extends Thread{
    MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.await();
    }
}
