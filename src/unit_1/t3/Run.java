package unit_1.t3;

/**
 * @author xiaogang
 * @date 2019/2/11 9:49
 */
public class Run {
    public static void main(String[] args) {
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");
        a.start();
        b.start();
        c.start();
    }
}
