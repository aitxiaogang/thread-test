package unit_1.priority;

/**
 * @author xiaogang
 * @date 2019/2/12 17:12
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("main thread begin priority = "+Thread.currentThread().getPriority());
        //线程的优先级具有传播的特性，a线程的优先级如果是6，那么a线程中开启的其它线程的优先级也是6
//        Thread.currentThread().setPriority(6);
        System.out.println("main thread end priority = "+Thread.currentThread().getPriority());
        MyThread1 t = new MyThread1();
        t.start();
    }
}
