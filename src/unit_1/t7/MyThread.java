package unit_1.t7;

/**
 * @author xiaogang
 * @date 2019/2/11 16:26
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread.run     "+this.isAlive());
    }
}
