package unit_2.test2;

/**
 * @author xiaogang
 * @date 2019/2/18 18:37
 */
public class Thread2 extends Thread{

    private MyObject myObject;

    private Service service;

    public Thread2(MyObject myObject, Service service) {
        this.myObject = myObject;
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod1(myObject);
    }
}
