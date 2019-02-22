package unit_2.throwExceptionNoLock;

/**
 * @author xiaogang
 * @date 2019/2/15 18:00
 */
public class Service {
    int i = 0;

    synchronized public void testMethod() {
        try {
            while (true) {
                System.out.println(Thread.currentThread().getName());
                i++;
                if (i > 8) {
                    i = 0;
                    throw new RuntimeException("故意抛出异常");
                }
                Thread.sleep(200);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
