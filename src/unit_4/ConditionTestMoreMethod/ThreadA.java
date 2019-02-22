package unit_4.ConditionTestMoreMethod;

/**
 * @author xiaogang
 * @date 2019/2/22 10:01
 */
public class ThreadA extends Thread {
    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.methodA();
    }
}
