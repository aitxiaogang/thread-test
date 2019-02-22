package unit_3.join_sleep_1;

/**
 * @author xiaogang
 * @date 2019/2/21 16:26
 */
public class ThreadA extends Thread{
    private ThreadB threadB;

    public ThreadA(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        try {
            synchronized (threadB) {
                threadB.start();
                Thread.sleep(6000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
