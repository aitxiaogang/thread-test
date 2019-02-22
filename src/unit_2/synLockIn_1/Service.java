package unit_2.synLockIn_1;

/**
 * @author xiaogang
 * @date 2019/2/15 17:36
 */
public class Service {
    synchronized public void service1(){
        System.out.println("Service.service1");
        service2();
    }

    synchronized public void service2(){
        System.out.println("Service.service2");
        service3();
    }

    synchronized public void service3(){
        System.out.println("Service.service3");
    }
}
