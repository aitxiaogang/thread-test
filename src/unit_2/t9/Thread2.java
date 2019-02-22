package unit_2.t9;

/**
 * @author xiaogang
 * @date 2019/2/18 16:41
 */
public class Thread2 extends Thread {
    private MyOneList list;

    public Thread2(MyOneList list) {
        this.list = list;
    }

    @Override
    public void run() {
        MyService service = new MyService();
        service.addServiceMethod(list,"B");
    }
}
