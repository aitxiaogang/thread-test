package unit_4.UseConditionWaitNotifyError;

/**
 * @author xiaogang
 * @date 2019/2/22 10:12
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        a.start();
    }
}
