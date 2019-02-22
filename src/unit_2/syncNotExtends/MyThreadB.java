package unit_2.syncNotExtends;

/**
 * @author xiaogang
 * @date 2019/2/18 11:23
 */
public class MyThreadB extends Thread {

    private Sub sub;

    public MyThreadB(Sub sub) {
        super();
        this.sub = sub;
    }

    @Override
    public void run() {
        try {
            sub.serviceMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
