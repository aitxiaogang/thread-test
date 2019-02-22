package unit_3.while_if_difference;

/**
 * @author xiaogang
 * @date 2019/2/20 18:46
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock = new String("");
        ThreadA threadA = new ThreadA(lock);
        threadA.start();
        ThreadB threadB = new ThreadB(lock);
        Thread.sleep(10);
        ValueObject.b = true;
        threadB.start();
    }
}
