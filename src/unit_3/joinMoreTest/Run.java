package unit_3.joinMoreTest;

import unit_3.join_sleep_2.ThreadC;

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
            threadB.start();
            threadB.join(2000);
            System.out.println("      main end  "+System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
