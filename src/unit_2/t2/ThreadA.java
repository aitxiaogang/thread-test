package unit_2.t2;

/**
 * @author xiaogang
 * @date 2019/2/14 10:55
 */
public class ThreadA extends Thread {

    private HasSelfPrivateNum selfPrivateNum;

    public ThreadA(HasSelfPrivateNum selfPrivateNum){
        this.selfPrivateNum = selfPrivateNum;
    }

    @Override
    public void run() {
        selfPrivateNum.addI("a");
    }
}
