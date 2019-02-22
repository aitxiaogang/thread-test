package unit_3.joinMoreTest;

/**
 * @author xiaogang
 * @date 2019/2/21 16:53
 */
public class RunFirst {
    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        ThreadA a = new ThreadA(b);
        a.start();
        a.setName("1");
        b.start();
        b.setName("2");
        System.out.println("main end="+System.currentTimeMillis());
    }
}
