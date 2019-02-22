package unit_2.setNewStringTwoLock;

import unit_2.doubleSynBlockOneTwo.ObjectService;

/**
 * @author xiaogang
 * @date 2019/2/18 12:26
 */
public class Thread1 extends Thread {
    MyService objectService;

    public Thread1(MyService objectService) {
        this.objectService = objectService;
    }

    @Override
    public void run() {
        objectService.testMethod();
    }
}
