package unit_4.awaitUntilTest;

/**
 * @author xiaogang
 * @date 2019/2/22 18:29
 */
public class Run {
    public static void main(String[] args) throws Exception {
        Service service = new Service();
        MyThreadA a = new MyThreadA(service);
        MyThreadB b = new MyThreadB(service);
        a.start();
        Thread.sleep(2000);
        b.start();
    }
}
