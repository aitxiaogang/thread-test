package unit_4.lockInterruptiblyTest2;

/**
 * @author xiaogang
 * @date 2019/2/22 17:14
 */
public class Run {
    public static void main(String[] args) throws Exception {
        Service service = new Service();
        Runnable runnable = () ->{
          service.waitMethod();
        };
        Thread a = new Thread(runnable);
        a.setName("a");
        a.start();
        Thread.sleep(500);

        Thread b = new Thread(runnable);
        b.setName("b");
        b.start();
        Thread.sleep(500);

        b.interrupt();

        System.out.println("main end!");
    }
}
