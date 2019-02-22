package unit_3.firstnotify;

/**
 * @author xiaogang
 * @date 2019/2/20 14:55
 */
public class MyRun {
    private String lock = new String("");
    private boolean isFisrtRunB = false;
    private Runnable runnableA = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {
                    while (isFisrtRunB == false) {
                        System.out.println("begin wait");
                        lock.wait();
                        System.out.println("end wait");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };
    private Runnable runnableB = new Runnable() {
        @Override
        public void run() {
            synchronized (lock) {
                System.out.println("begin notify");
                lock.notify();
                System.out.println("end notify");
                isFisrtRunB = true;
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        MyRun run = new MyRun();
        Thread a = new Thread(run.runnableA);
        Thread b = new Thread(run.runnableB);
        Thread.sleep(100);
        a.start();
        b.start();
    }
}
