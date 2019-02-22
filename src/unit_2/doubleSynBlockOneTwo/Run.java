package unit_2.doubleSynBlockOneTwo;


/**
 * @author xiaogang
 * @date 2019/2/18 12:27
 */
public class Run {
    public static void main(String[] args) {
        ObjectService objectService = new ObjectService();
        Thread1 t = new Thread1(objectService);
        t.setName("A");
        t.start();
        Thread2 t2 = new Thread2(objectService);
        t2.setName("B");
        t2.start();
    }
}
