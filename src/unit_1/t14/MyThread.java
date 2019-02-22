package unit_1.t14;

/**
 * @author xiaogang
 * @date 2019/2/12 14:25
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("run begin");
            Thread.sleep(20000);
            System.out.println("run end");
        }catch (Exception e){
            System.out.println("在sleep中被标记为interrupt状态，被catch住"+this.isInterrupted());
            e.printStackTrace();
        }
    }
}
