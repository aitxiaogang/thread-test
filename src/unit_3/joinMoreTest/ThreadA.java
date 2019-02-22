package unit_3.joinMoreTest;

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
                System.out.println("threadName"+Thread.currentThread().getName()+"a run begin time="+System.currentTimeMillis());
                Thread.sleep(5000);
                System.out.println("threadName"+Thread.currentThread().getName()+"a run end time="+System.currentTimeMillis());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
