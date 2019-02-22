package unit_4.MustuseMoreCondition_Error;

/**
 * @author xiaogang
 * @date 2019/2/22 10:45
 */
public class ThreadA extends Thread {
    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.awaitA();
    }
}
