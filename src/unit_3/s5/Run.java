package unit_3.s5;

/**
 * @author xiaogang
 * @date 2019/2/21 17:53
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        ThreadA a = new ThreadA();
        a.start();
        Thread.sleep(1000);
        ThreadB b = new ThreadB();
        b.start();
    }
}
