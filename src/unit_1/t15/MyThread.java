package unit_1.t15;

/**
 * @author xiaogang
 * @date 2019/2/12 14:25
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5000; i++) {
                System.out.println("i= "+i);
            }
            System.out.println("run begin");
            Thread.sleep(20000);
            System.out.println("run end");
        }catch (Exception e){
            System.out.println("先停止，再遇到了sleep，进入catch   "+this.isInterrupted());
            e.printStackTrace();
        }
    }
}
