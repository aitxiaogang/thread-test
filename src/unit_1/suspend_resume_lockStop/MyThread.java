package unit_1.suspend_resume_lockStop;

/**
 * @author xiaogang
 * @date 2019/2/12 15:59
 */
public class MyThread extends Thread {
    private int i = 0;

    @Override
    public void run() {
        while (true) {
            i++;
            System.out.println(i);
        }
    }
}
