package unit_1.priority;

/**
 * @author xiaogang
 * @date 2019/2/12 17:11
 */
public class MyThread1 extends Thread{
    @Override
    public void run() {
        System.out.println("MyThread1 priority = "+this.getPriority());
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
    }
}
