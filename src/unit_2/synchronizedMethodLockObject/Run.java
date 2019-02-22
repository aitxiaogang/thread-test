package unit_2.synchronizedMethodLockObject;

/**
 * @author xiaogang
 * @date 2019/2/14 12:28
 */
public class Run {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA threadA = new ThreadA(object);
        Thread t = new Thread(threadA,"a");
        Thread t2 = new Thread(threadA,"b");
        t.start();
        t2.start();
    }
}
