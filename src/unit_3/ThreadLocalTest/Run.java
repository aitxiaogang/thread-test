package unit_3.ThreadLocalTest;

/**
 * @author xiaogang
 * @date 2019/2/21 17:53
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        a.start();
        b.start();
        for (int i = 0; i < 100; i++) {
            Tools.t1.set("main "+(i+1));
            System.out.println("main get value="+Tools.t1.get());
            Thread.sleep(200);
        }
    }
}
