package unit_2.setNewPropertiesLockOne;


/**
 * @author xiaogang
 * @date 2019/2/18 12:27
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service objectService = new Service();
        Userinfo userinfo = new Userinfo();
        Thread1 t = new Thread1(objectService,userinfo);
        t.setName("A");
        t.start();
        Thread2 t2 = new Thread2(objectService,userinfo);
        t2.setName("B");
        t2.start();
    }
}
