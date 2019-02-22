package unit_3.join_sleep_2;

/**
 * @author xiaogang
 * @date 2019/2/21 16:28
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadB threadB = new ThreadB();
            ThreadA threadA = new ThreadA(threadB);
            threadA.start();
            Thread.sleep(1000);
            ThreadC threadC = new ThreadC(threadB);
            threadC.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
