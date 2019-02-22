package unit_4.ConditionTestMoreMethod;

/**
 * @author xiaogang
 * @date 2019/2/22 10:02
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        ThreadAA aa = new ThreadAA(myService);
        a.setName("a");
        aa.setName("aa");
        a.start();
        aa.start();
        Thread.sleep(2000);
        ThreadB b = new ThreadB(myService);
        ThreadBB bb = new ThreadBB(myService);
        b.setName("b");
        bb.setName("bb");
        b.start();
        bb.start();
    }
}

