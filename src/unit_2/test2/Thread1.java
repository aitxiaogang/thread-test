package unit_2.test2;

/**
 * @author xiaogang
 * @date 2019/2/18 18:37
 */
public class Thread1 extends Thread{
    private MyObject myObject;

    public Thread1(MyObject myObject) {
        this.myObject = myObject;
    }

    @Override
    public void run() {
        myObject.speedPrintString();
    }
}
