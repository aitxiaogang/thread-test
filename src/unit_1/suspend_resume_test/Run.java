package unit_1.suspend_resume_test;

/**
 * @author xiaogang
 * @date 2019/2/12 15:15
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(5000);

            myThread.suspend();
            System.out.println("A = " + System.currentTimeMillis()+" i=" +myThread.getI());
            Thread.sleep(5000);
            System.out.println("A = " + System.currentTimeMillis()+" i=" +myThread.getI());

            myThread.resume();
            Thread.sleep(5000);

            myThread.suspend();
            System.out.println("B = " + System.currentTimeMillis()+" i=" +myThread.getI());
            Thread.sleep(5000);
            System.out.println("B = " + System.currentTimeMillis()+" i=" +myThread.getI());


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
