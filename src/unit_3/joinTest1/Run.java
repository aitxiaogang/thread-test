package unit_3.joinTest1;

/**
 * @author xiaogang
 * @date 2019/2/21 15:57
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
//        Thread.sleep(?);
        System.out.println("我想当myThread线程执行完成之后再执行");
        System.out.println("但上面代码中的sleep中的值应该写多少呢？");
        System.out.println("答案是：不确定");
    }
}
