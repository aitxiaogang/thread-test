package unit_4.lockMethodTest3.test2;

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

        Thread thread = new Thread(runnable);
        thread.start();

    }
}
