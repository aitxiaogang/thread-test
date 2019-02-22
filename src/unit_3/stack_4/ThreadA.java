package unit_3.stack_4;

/**
 * @author xiaogang
 * @date 2019/2/21 11:25
 */
public class ThreadA extends Thread {

    private P p;

    public ThreadA(P p) {
        this.p = p;
    }

    /**
     * 调用生产者，不停的往栈中加入数据
     */
    @Override
    public void run() {
        while (true){
            p.pushService();
        }
    }
}
