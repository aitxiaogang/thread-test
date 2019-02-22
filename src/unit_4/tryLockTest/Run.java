package unit_4.tryLockTest;

/**
 * @author xiaogang
 * @date 2019/2/22 17:30
 */
public class Run {
    public static void main(String[] args) throws Exception {
        MyService myService = new MyService();
        Runnable runnable = () ->{
            myService.waitMethod();
        };
        Thread a = new Thread(runnable);
        a.setName("a");
        Thread b = new Thread(runnable);
        b.setName("b");
        a.start();
        b.start();
    }
}
