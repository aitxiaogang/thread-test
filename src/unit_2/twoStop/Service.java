package unit_2.twoStop;

/**
 * @author xiaogang
 * @date 2019/2/19 10:17
 */
public class Service {
    Object object = new Object();
    public void methodA(){
        synchronized (object){
            System.out.println("Service.methodA begin");
            boolean b = true;
            while (b) {

            }
            System.out.println("Service.methodA end");
        }
    }

    Object object2 = new Object();
    public void methodB(){
        synchronized (object2){
            System.out.println("Service.methodB begin");
            System.out.println("Service.methodB end");
        }
    }

}
