package unit_2.t16;

/**
 * @author xiaogang
 * @date 2019/2/19 15:49
 */
public class Run {
    public static void main(String[] args) {
        try {
            RunThread runThread = new RunThread();
            runThread.start();
            Thread.sleep(1000);
            runThread.setRunning(false);
            System.out.println("runThread.isRunning()="+runThread.isRunning());
            System.out.println("已经赋值为false了");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
