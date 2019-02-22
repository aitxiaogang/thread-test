package unit_2.synchronizedMethodLockObject2;

/**
 * @author xiaogang
 * @date 2019/2/14 12:12
 */
public class ThreadA extends Thread {
    private MyObject myObject;

    public ThreadA(MyObject myObject) {
        this.myObject = myObject;
    }

    @Override
    public void run() {
        myObject.methodA();
    }
}
