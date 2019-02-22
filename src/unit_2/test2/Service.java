package unit_2.test2;

/**
 * @author xiaogang
 * @date 2019/2/18 18:35
 */
public class Service {
    public void testMethod1(MyObject myObject) {
        synchronized (myObject) {
            try {
                System.out.println("BService.testMethod1   -----getLock time=" + System.currentTimeMillis() + "   thread name = " + Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println("BService.testMethod1   -----releaseLock time=" + System.currentTimeMillis() + "   thread name = " + Thread.currentThread().getName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
