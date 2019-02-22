package unit_4.tryLock_param;

/**
 * @author xiaogang
 * @date 2019/2/22 17:30
 */
public class Run {
    public static void main(String[] args) throws Exception {
        final MyService myService = new MyService();
        Runnable runnable = () ->{
            System.out.println(Thread.currentThread().getName()+" 调用waitMethod时间："+System.currentTimeMillis());
            myService.waitMethod();
        };
        Thread a = new Thread(runnable);
        a.setName("a");
        a.start();
        Thread b = new Thread(runnable);
        b.setName("b");
        b.start();
    }
}
