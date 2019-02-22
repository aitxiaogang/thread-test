package unit_1.priority;

/**
 * @author xiaogang
 * @date 2019/2/12 17:12
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread2 priority = "+this.getPriority());
    }
}
