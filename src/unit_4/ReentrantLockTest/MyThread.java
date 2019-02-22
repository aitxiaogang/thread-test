package unit_4.ReentrantLockTest;

/**
 * @author xiaogang
 * @date 2019/2/21 18:46
 */
public class MyThread extends Thread {

    private MyService myService;

    public MyThread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
