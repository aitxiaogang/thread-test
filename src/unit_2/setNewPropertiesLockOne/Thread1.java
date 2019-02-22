package unit_2.setNewPropertiesLockOne;

import unit_2.setNewStringTwoLock.MyService;

/**
 * @author xiaogang
 * @date 2019/2/18 12:26
 */
public class Thread1 extends Thread {
    Service objectService;
    Userinfo userinfo;

    public Thread1(Service objectService, Userinfo userinfo) {
        this.objectService = objectService;
        this.userinfo = userinfo;
    }

    @Override
    public void run() {
        objectService.serviceMethodA(userinfo);
    }
}
