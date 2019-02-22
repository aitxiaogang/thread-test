package unit_2.syncNotExtends;

/**
 * @author xiaogang
 * @date 2019/2/18 11:23
 */
public class MyThreadA extends Thread {

    private Sub sub;

    public MyThreadA(Sub sub) {
        super();
        this.sub = sub;
    }

    @Override
    synchronized public void run() {
        try {
            sub.serviceMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
