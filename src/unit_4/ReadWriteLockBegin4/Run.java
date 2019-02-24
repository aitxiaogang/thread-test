package unit_4.ReadWriteLockBegin4;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xiaogang
 * @date: 2019/2/24 13:37
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Run {
    public static void main(String[] args) throws Exception {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        ThreadB b = new ThreadB(service);
        b.start();
        Thread.sleep(1000);
        System.out.println("准备开启读操作");
        a.start();
    }
}
