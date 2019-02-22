package unit_3.waitOld;

/**
 * @author xiaogang
 * @date 2019/2/20 16:23
 */
public class ThreadAdd extends Thread {

    private Add add;

    public ThreadAdd(Add add) {
        this.add = add;
    }

    @Override
    public void run() {
        add.add();
    }
}
