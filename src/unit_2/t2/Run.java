package unit_2.t2;

/**
 * @author xiaogang
 * @date 2019/2/14 10:57
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum selfPrivateNum = new HasSelfPrivateNum();
        ThreadA a = new ThreadA(selfPrivateNum);
        a.start();
        ThreadB b = new ThreadB(selfPrivateNum);
        b.start();
    }
}
