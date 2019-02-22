package unit_2.synchronizedMethodLockObject;

/**
 * @author xiaogang
 * @date 2019/2/14 12:10
 */
public class MyObject {
    public synchronized void methodA(){
        System.out.println("MyObject.methodA  "+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
