package unit_2.twoObjectTwoLock;

/**
 * @author xiaogang
 * @date 2019/2/14 10:55
 */
public class ThreadB extends Thread {

    private HasSelfPrivateNum selfPrivateNum;

    public ThreadB(HasSelfPrivateNum selfPrivateNum){
        this.selfPrivateNum = selfPrivateNum;
    }

    @Override
    public void run() {
        selfPrivateNum.addI("b");
    }
}
