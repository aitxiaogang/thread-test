package unit_2.setNewStringTwoLock;

/**
 * @author xiaogang
 * @date 2019/2/19 15:01
 */
public class MyService {
    private String lock = "123";

    public void testMethod(){
        synchronized (lock){
            try {
                System.out.println(Thread.currentThread().getName()+" begin "+System.currentTimeMillis());
                lock = "456";
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName()+" end "+System.currentTimeMillis());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
