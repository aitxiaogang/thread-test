package unit_2.syncNotExtends;

/**
 * @author xiaogang
 * @date 2019/2/18 11:20
 */
public class Sub extends Main{

    @Override
    synchronized public void serviceMethod() throws InterruptedException {
        System.out.println("Sub.serviceMethod + "+Thread.currentThread().getName());
        Thread.sleep(5000);
        System.out.println("Sub.serviceMethod + "+Thread.currentThread().getName());
        super.serviceMethod();
    }
}
