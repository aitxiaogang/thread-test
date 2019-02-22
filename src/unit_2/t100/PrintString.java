package unit_2.t100;

/**
 * @author xiaogang
 * @date 2019/2/19 15:26
 */
public class PrintString implements Runnable{
    private boolean isContinuePrint = true;
    public boolean isContinuePrint(){
        return isContinuePrint;
    }
    public void setContinuePrint(boolean continuePrint) {
        isContinuePrint = continuePrint;
    }

    public void printStringMethod(){
        try {
            while (isContinuePrint == true) {
                System.out.println("run printStringMethod threadName="+Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        printStringMethod();
    }
}
