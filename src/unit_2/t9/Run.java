package unit_2.t9;

/**
 * @author xiaogang
 * @date 2019/2/18 16:42
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyOneList list = new MyOneList();
        Thread1 t = new Thread1(list);
        t.setName("A");
        t.start();
        Thread2 t2 = new Thread2(list);
        t2.setName("B");
        t2.start();
        Thread.sleep(6000);
        System.out.println("listSize="+list.getSize());
    }
}
