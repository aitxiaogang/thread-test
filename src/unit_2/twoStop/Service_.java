package unit_2.twoStop;

/**
 * @author xiaogang
 * @date 2019/2/19 10:17
 */
public class Service_ {
    synchronized public void methodA(){
        System.out.println("Service.methodA begin");
        boolean b = true;
        while (b) {

        }
        System.out.println("Service.methodA end");
    }

    synchronized public void methodB(){
        System.out.println("Service.methodB begin");
        System.out.println("Service.methodB end");
    }

}
