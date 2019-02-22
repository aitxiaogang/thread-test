package unit_2.throwExceptionNoLock;

/**
 * @author xiaogang
 * @date 2019/2/15 18:13
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        MyThread t1 = new MyThread(service);
        MyThread2 t2 = new MyThread2(service);
        t1.setName("a");
        t2.setName("b");
        t1.start();
        t2.start();
    }
}
