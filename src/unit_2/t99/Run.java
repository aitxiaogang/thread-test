package unit_2.t99;

/**
 * @author xiaogang
 * @date 2019/2/19 15:30
 */
public class Run {
    public static void main(String[] args) {
        PrintString printString = new PrintString();
        printString.printStringMethod();
        System.out.println("我要停止它！stopThread= "+Thread.currentThread().getName());
        printString.setContinuePrint(false);
    }
}
