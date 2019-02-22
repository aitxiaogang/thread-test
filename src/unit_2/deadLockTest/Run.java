package unit_2.deadLockTest;

/**
 * @author xiaogang
 * @date 2019/2/19 11:01
 */
public class Run {
    public static void main(String[] args) {
        try {
         DealThread dealThread = new DealThread();
         dealThread.setFlag("a");
         Thread t1 = new Thread(dealThread);
         t1.start();
         Thread.sleep(100);
         dealThread.setFlag("b");
         Thread t2 = new Thread(dealThread);
         t2.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
