package unit_1.isaliveOtherTest;

/**
 * @author xiaogang
 * @date 2019/2/11 16:34
 */
public class CountOperate extends Thread{
    public CountOperate() {
        System.out.println("CountOperate.CountOperate --begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive() = " + Thread.currentThread().isAlive());
        System.out.println("this.getName()="+this.getName());
        System.out.println("this.isAlive() = " + this.isAlive());
        System.out.println("CountOperate.CountOperate--end");
    }

    @Override
    public void run() {
        System.out.println("run --begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive() = " + Thread.currentThread().isAlive());
        System.out.println("this.getName()="+this.getName());
        System.out.println("this.isAlive() = " + this.isAlive());
        System.out.println("run --end");
    }
}
