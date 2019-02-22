package unit_3.stack_1;

/**
 * @author xiaogang
 * @date 2019/2/20 16:50
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C c = new C(myStack);
        //此线程不停的往stack中添加数据，加到1个就等待，等待其他线程将stack中的数据使用掉
        ThreadP threadP = new ThreadP(p);
        //不停的从stack中取出数据，如果stack中没有数据，等待其他线程将数据push到stack中
        ThreadC threadC = new ThreadC(c);

        //注意：如果p线程将数据push到stack中，c线程处于等待队列中，没有执行的权限，需要被设置
        //为“就绪”队列中才能去获取锁来获取执行权
        //而这这个程序中，只有两个线程，c线程处于等待状态，那么只能等p线程来唤醒/设置 c线程到就绪的状态
        //并且唤醒也不是定向的唤醒，notify也只是通知对象的某一个“等待”线程可以为“就绪”的状态
        threadP.start();
        threadC.start();
    }
}
