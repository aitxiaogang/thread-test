package unit_2.t7;

/**
 * @author xiaogang
 * @date 2019/2/18 12:26
 */
public class Thread1 extends Thread {
    Task task;

    public Thread1(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        task.doLongTimeTash();
    }
}
