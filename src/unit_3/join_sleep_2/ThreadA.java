package unit_3.join_sleep_2;

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
                threadB.join();
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    String newString = new String();
                    Math.random();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
