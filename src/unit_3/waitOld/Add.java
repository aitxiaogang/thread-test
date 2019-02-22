package unit_3.waitOld;

/**
 * @author xiaogang
 * @date 2019/2/20 16:07
 */
public class Add {
    private String lock;

    public Add(String lock) {
        this.lock = lock;
    }
    public void add(){
        //进入到这里的时候，lock的“就绪队列”就是“add”线程，“等待队列”有threadSubtract和threadSubtract2
        synchronized (lock) {
            ValueObject.list.add("anyString");
            //将lock的所有等待队列的线程唤醒，全都变成就绪状态
            lock.notifyAll();
        }
    }
}
