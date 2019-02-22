package unit_4.ConditionTest;


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
        while (true) {
            myService.printB();
        }
    }
}
