package unit_3.notifyOne;

/**
 * @author xiaogang
 * @date 2019/2/20 12:15
 */
public class Service {
    public void testMethod(Object lock){
        try {
            synchronized (lock) {
                System.out.println("begin wait() " +Thread.currentThread().getName());
                lock.wait();
                System.out.println("end wait() " +Thread.currentThread().getName());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
