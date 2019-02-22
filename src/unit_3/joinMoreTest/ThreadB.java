package unit_3.joinMoreTest;

/**
 * @author xiaogang
 * @date 2019/2/21 16:26
 */
public class ThreadB extends Thread {
    @Override
    synchronized public void run() {
        try {
            System.out.println("threadName"+Thread.currentThread().getName()+" B run begin time="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("threadName"+Thread.currentThread().getName()+" B run end time="+System.currentTimeMillis());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    synchronized public void bService(){
        System.out.println("ThreadB.bService:"+System.currentTimeMillis());
    }
}
