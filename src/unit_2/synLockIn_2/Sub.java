package unit_2.synLockIn_2;

/**
 * @author xiaogang
 * @date 2019/2/15 17:43
 */
public class Sub extends Main {
    synchronized public void operateISubMethod() {
        try {
            while (i > 0) {
                i--;
                System.out.println("sub  i = " + i);
                Thread.sleep(100);
                this.operateImainMethod();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
