package unit_3.waitHasParamMethod;

import java.util.Date;

/**
 * @author xiaogang
 * @date 2019/2/20 14:23
 */
public class MyRunnable {
    private static Object lock = new Object();
    private static Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            System.out.println(new Date().toLocaleString());
            try {
                synchronized (lock) {
                    System.out.println("wait begin timer="+System.currentTimeMillis());
                    lock.wait(5000);
                    System.out.println("wait end timer="+System.currentTimeMillis());
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(new Date().toLocaleString());
        }
    };

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(runnable1);
        t.start();
        Thread.sleep(2000);
        synchronized (lock){
            lock.notify();
        }
    }
}
