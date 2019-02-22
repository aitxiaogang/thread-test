package unit_2.t100;

/**
 * @author xiaogang
 * @date 2019/2/19 15:30
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        PrintString printString = new PrintString();
        Thread t1 = new Thread(printString);
        t1.start();
        Thread.sleep(5000);
        System.out.println("我要停止它！stopThread= "+Thread.currentThread().getName());
        printString.setContinuePrint(false);
    }
}
