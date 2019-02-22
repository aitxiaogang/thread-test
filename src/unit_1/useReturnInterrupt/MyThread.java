package unit_1.useReturnInterrupt;

/**
 * @author xiaogang
 * @date 2019/2/12 14:50
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        while (true){
            if (isInterrupted()) {
                System.out.println("线程标记停止了，马上停止");
                return;
            }
            System.out.println(System.currentTimeMillis());
        }
    }
}
