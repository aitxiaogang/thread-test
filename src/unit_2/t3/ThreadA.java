package unit_2.t3;

/**
 * @author xiaogang
 * @date 2019/2/14 18:29
 */
public class ThreadA extends Thread {

    PublicVar publicVar;

    public ThreadA(PublicVar publicVar) {
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        publicVar.setValue("B","BB");
    }
}
