package unit_3.waitOld;

/**
 * @author xiaogang
 * @date 2019/2/20 16:24
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock = new String("");
        Add add = new Add(lock);
        Subtract subtract = new Subtract(lock);
        ThreadSubtract threadSubtract = new ThreadSubtract(subtract);
        threadSubtract.setName("threadSubtract");
        threadSubtract.start();
        ThreadSubtract threadSubtract2 = new ThreadSubtract(subtract);
        threadSubtract2.setName("threadSubtract2");
        threadSubtract2.start();
        Thread.sleep(1000);
        ThreadAdd threadAdd = new ThreadAdd(add);
        threadAdd.setName("add");
        threadAdd.start();
    }
}
