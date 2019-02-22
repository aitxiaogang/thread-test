package unit_2.test2;

/**
 * @author xiaogang
 * @date 2019/2/18 18:33
 */
public class MyObject {
    synchronized public void speedPrintString(){
        System.out.println("MyObject.speedPrintString   -----getLock time="+System.currentTimeMillis()+"   thread name = "+Thread.currentThread().getName());
        System.out.println("----------------");
        System.out.println("MyObject.speedPrintString   -----releaseLock time="+System.currentTimeMillis()+"   thread name = "+Thread.currentThread().getName());
    }
}
