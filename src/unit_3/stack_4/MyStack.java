package unit_3.stack_4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaogang
 * @date 2019/2/21 11:15
 */
public class MyStack {
    private List list = new ArrayList();

    /**
     * 只能放入一个元素
     */
    synchronized public void push() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+" MyStack.push");
        while (list.size() == 1) {
            System.out.println(Thread.currentThread().getName()+"集合中有一个元素，等待被取出");
            this.wait();
            System.out.println(Thread.currentThread().getName()+"push   结束等待");
        }
        list.add("push  anyString:"+System.currentTimeMillis());
        //向集合中添加了元素，通知消费者取
        this.notifyAll();
    }

    synchronized public Object pop() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+"MyStack.pop");
        while (list.size() == 0) {
            System.out.println(Thread.currentThread().getName()+"没有元素，等待其他线程将数据存入");
            this.wait();
            System.out.println(Thread.currentThread().getName()+"MyStack.pop  wait end");
        }
        Object remove = list.remove(0);
        this.notifyAll();
        System.out.println(Thread.currentThread().getName()+"  pop  已经取出元素，当前list size："+list.size());
        return remove;
    }

}
