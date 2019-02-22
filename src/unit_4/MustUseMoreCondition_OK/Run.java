package unit_4.MustUseMoreCondition_OK;

/**
 * @author xiaogang
 * @date 2019/2/22 10:52
 */
public class Run {
    public static void main(String[] args) throws Exception {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        ThreadB b = new ThreadB(myService);
        a.setName("a");
        b.setName("b");
        a.start();
        b.start();
        Thread.sleep(1000);
//        myService.signalA();
        myService.signalB();
    }
}
