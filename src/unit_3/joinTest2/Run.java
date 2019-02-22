package unit_3.joinTest2;

/**
 * @author xiaogang
 * @date 2019/2/21 15:57
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.join();
        System.out.println("我想当myThread线程执行完毕之后再执行，成功了");
    }
}
