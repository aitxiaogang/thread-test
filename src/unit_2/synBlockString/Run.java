package unit_2.synBlockString;

/**
 * @author xiaogang
 * @date 2019/2/18 12:27
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        Thread1 t = new Thread1(service);
        t.setName("A");
        t.start();
        Thread2 t2 = new Thread2(service);
        t2.setName("B");
        t2.start();
    }
}
