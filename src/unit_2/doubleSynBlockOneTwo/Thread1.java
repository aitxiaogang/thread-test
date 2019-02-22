package unit_2.doubleSynBlockOneTwo;

import unit_2.t7.Task;

/**
 * @author xiaogang
 * @date 2019/2/18 12:26
 */
public class Thread1 extends Thread {
    ObjectService objectService;

    public Thread1(ObjectService objectService) {
        this.objectService = objectService;
    }

    @Override
    public void run() {
        objectService.serviceMethodA();
    }
}
