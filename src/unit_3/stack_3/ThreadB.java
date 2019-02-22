package unit_3.stack_3;

/**
 * @author xiaogang
 * @date 2019/2/21 11:26
 */
public class ThreadB extends Thread {

    private C c;

    public ThreadB(C c) {
        this.c = c;
    }

    /**
     * 调用消费者，不停的取出数据
     */
    @Override
    public void run() {
        while (true) {
            Object o = c.popService();
            System.out.println("取出的数据:"+o);
        }
    }
}
