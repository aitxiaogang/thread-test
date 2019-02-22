package unit_2.test3;

/**
 * @author xiaogang
 * @date 2019/2/18 18:38
 */
public class Run {
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        Service service = new Service();
        Thread1 thread1 = new Thread1(myObject);
        thread1.setName("A");
        Thread2 thread2 = new Thread2(myObject,service);
        thread2.setName("B");
        thread2.start();
        thread1.start();
    }
}
