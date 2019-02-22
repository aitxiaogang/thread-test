package unit_1.t4;

/**
 * @author xiaogang
 * @date 2019/2/11 9:49
 */
public class Run {
    public static void main(String[] args) {
        //多个线程跑同一个类，那个类里面的成员变量就是多个线程共享的变量，那个变量则是线程不安全的
        MyThread myThread = new MyThread("A");
        Thread a = new Thread(myThread,"A");
        Thread b = new Thread(myThread,"B");
        Thread c = new Thread(myThread,"C");
        Thread d = new Thread(myThread,"D");
        Thread e = new Thread(myThread,"E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
