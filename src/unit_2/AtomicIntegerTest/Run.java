package unit_2.AtomicIntegerTest;

/**
 * @author xiaogang
 * @date 2019/2/19 16:37
 */
public class Run {
    public static void main(String[] args) {
        AddCountThread addCountThread = new AddCountThread();
        Thread t1 = new Thread(addCountThread);
        Thread t2 = new Thread(addCountThread);
        Thread t3 = new Thread(addCountThread);
        Thread t4 = new Thread(addCountThread);
        Thread t5 = new Thread(addCountThread);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
