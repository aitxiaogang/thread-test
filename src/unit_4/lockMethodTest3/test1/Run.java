package unit_4.lockMethodTest3.test1;

/**
 * @author xiaogang
 * @date 2019/2/22 16:57
 */
public class Run {
    public static void main(String[] args) throws Exception {


        Runnable runnable = () -> {
            Service service = new Service(true);
            service.serviceMethod();
        };

        Runnable runnable2 = () ->{
            Service service = new Service(false);
            service.serviceMethod();
        };

        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread2 = new Thread(runnable2);
        thread2.start();

    }
}
