package unit_2.test3;

/**
 * @author xiaogang
 * @date 2019/2/18 18:33
 */
public class MyObject {
    public void speedPrintString(){
        synchronized (this){
            System.out.println("MyObject.speedPrintString   -----getLock time="+System.currentTimeMillis()+"   thread name = "+Thread.currentThread().getName());
            System.out.println("----------------");
            System.out.println("MyObject.speedPrintString   -----releaseLock time="+System.currentTimeMillis()+"   thread name = "+Thread.currentThread().getName());
        }
    }
}
