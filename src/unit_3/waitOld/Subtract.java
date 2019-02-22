package unit_3.waitOld;

/**
 * @author xiaogang
 * @date 2019/2/20 16:21
 */
public class Subtract {
    private String lock;

    public Subtract(String lock) {
        this.lock = lock;
    }

    public void subtract(){
        try {
            synchronized (lock) {
                if (ValueObject.list.size() == 0) {
                    System.out.println("wait begin ThreadName = "+Thread.currentThread().getName());
                    //因为第一个线程进入到这里之后，wait会马上释放锁，所以会有其他线程进入到这里
                    //只要满足if条件，会有无数个线程可以进入到这里
                    lock.wait();
                    System.out.println("wait end ThreadName = "+Thread.currentThread().getName());
                }
                ValueObject.list.remove(0);
                System.out.println("list size = "+ValueObject.list.size());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
