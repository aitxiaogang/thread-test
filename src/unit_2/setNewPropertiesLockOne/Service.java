package unit_2.setNewPropertiesLockOne;

/**
 * @author xiaogang
 * @date 2019/2/19 15:09
 */
public class Service {
    public void serviceMethodA(Userinfo userinfo){
        synchronized (userinfo){
            try {
                System.out.println(Thread.currentThread().getName()+" start");
                userinfo.setUsername("abcabc");
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName() + " end! time="+System.currentTimeMillis());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
