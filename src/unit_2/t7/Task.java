package unit_2.t7;

/**
 * @author xiaogang
 * @date 2019/2/18 12:24
 */
public class Task {
    public void doLongTimeTash(){
        for (int i = 0; i < 100; i++) {
            System.out.println("no synchronized threadName="+Thread.currentThread().getName()+" i="+(i));
        }
        System.out.println("");
        synchronized (this){
            for (int i = 0; i < 100; i++) {
                System.out.println("synchronized threadName="+Thread.currentThread().getName()+" i="+(i));
            }
        }
    }
}
