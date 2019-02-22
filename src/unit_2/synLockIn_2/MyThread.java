package unit_2.synLockIn_2;

/**
 * @author xiaogang
 * @date 2019/2/15 17:44
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        Sub sub = new Sub();
        sub.operateISubMethod();
    }
}
