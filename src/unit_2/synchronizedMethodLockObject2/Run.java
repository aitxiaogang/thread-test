package unit_2.synchronizedMethodLockObject2;

/**
 * @author xiaogang
 * @date 2019/2/14 12:28
 */
public class Run {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        ThreadA threadA = new ThreadA(object);
        ThreadB threadB = new ThreadB(object);
        threadA.setName("a");
        threadB.setName("b");
        threadA.start();
        threadB.start();
    }
}
