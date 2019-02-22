package unit_1.currentThreadExt;

/**
 * @author xiaogang
 * @date 2019/2/11 15:44
 */
public class CountOperate extends Thread {
    public CountOperate() {
        System.out.println("CountOperate.CountOperate --begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()="+this.getName());
        System.out.println("CountOperate.CountOperate--end");
    }

    @Override
    public void run() {
        System.out.println("run --begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()="+this.getName());
        System.out.println("run --end");
    }
}
