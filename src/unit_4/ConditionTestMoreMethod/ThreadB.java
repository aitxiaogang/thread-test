package unit_4.ConditionTestMoreMethod;

/**
 * @author xiaogang
 * @date 2019/2/22 10:01
 */
public class ThreadB extends Thread {
    private MyService myService;

    public ThreadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.methodB();
    }
}
