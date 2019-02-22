package unit_2.AtomicIntegerTest;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author xiaogang
 * @date 2019/2/19 16:36
 */
public class AddCountThread extends Thread {

    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName()+"     "+count.incrementAndGet());
        }
    }
}
