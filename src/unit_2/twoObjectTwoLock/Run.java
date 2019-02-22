package unit_2.twoObjectTwoLock;

/**
 * @author xiaogang
 * @date 2019/2/14 10:57
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum selfPrivateNum = new HasSelfPrivateNum();
        HasSelfPrivateNum selfPrivateNum2 = new HasSelfPrivateNum();
        ThreadA a = new ThreadA(selfPrivateNum);
        a.start();
        ThreadB b = new ThreadB(selfPrivateNum2);
        b.start();
    }
}
