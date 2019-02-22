package unit_4.ConditionTest;


/**
 * @author xiaogang
 * @date 2019/2/22 10:02
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(myService);
        b.setName("b");
        b.start();
    }
}

