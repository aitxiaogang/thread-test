package unit_1.suspend_resume_del_lock;

/**
 * @author xiaogang
 * @date 2019/2/12 15:36
 */
public class SynchronizedObject {
    synchronized public void printString(){
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("a线程永远 suspend 了！");
            Thread.currentThread().suspend();
        }
    }
}
