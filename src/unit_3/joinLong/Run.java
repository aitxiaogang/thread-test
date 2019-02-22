package unit_3.joinLong;

/**
 * @author xiaogang
 * @date 2019/2/21 16:19
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            myThread.join(2000);
            System.out.println(" end timer=" + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
