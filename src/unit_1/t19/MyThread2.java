package unit_1.t19;

import java.util.Random;

/**
 * @author xiaogang
 * @date 2019/2/12 18:01
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        long result = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 50000; j++) {
                Random random = new Random();
                random.nextInt();
                result = result + i;
            }
        }
        System.out.println(result);
        long end = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName()+" ^^^^^^^^^^^  循环求5000的和，用时："+(end-start));
    }
}
