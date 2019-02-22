package unit_2.t7;

/**
 * @author xiaogang
 * @date 2019/2/18 12:27
 */
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        Thread1 t = new Thread1(task);
        t.setName("A");
        t.start();
        Thread2 t2 = new Thread2(task);
        t2.setName("B");
        t2.start();
    }
}
