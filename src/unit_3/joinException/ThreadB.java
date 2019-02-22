package unit_3.joinException;

/**
 * @author xiaogang
 * @date 2019/2/21 16:05
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            ThreadA threadA = new ThreadA();
            threadA.start();
            threadA.join();
            System.out.println("线程B在run end打印了");
        }catch (Exception e){
            System.out.println("线程B在run catch打印了");
            e.printStackTrace();
        }
    }
}
