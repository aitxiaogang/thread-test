package unit_2.synLockIn_2;

/**
 * @author xiaogang
 * @date 2019/2/15 17:42
 */
public class Main {
    public int i = 10;

    synchronized public void operateImainMethod() {
        try {
            i--;
            System.out.println("main  i = " + i);
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
