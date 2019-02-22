package unit_2.syncNotExtends;

/**
 * @author xiaogang
 * @date 2019/2/18 11:20
 */
public class Main {
    synchronized public void serviceMethod() throws InterruptedException {
        System.out.println("Main.serviceMethod + "+Thread.currentThread().getName());
        Thread.sleep(5000);
        System.out.println("Main.serviceMethod + "+Thread.currentThread().getName());
    }
}
