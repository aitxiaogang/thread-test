package unit_1.interruptTest;

/**
 * @author xiaogang
 * @date 2019/2/12 10:59
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("sub thread start");
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("sub thread isInterrupted  ="+Thread.currentThread().isInterrupted());
        }
        System.out.println("sub thread stop");
    }
}
