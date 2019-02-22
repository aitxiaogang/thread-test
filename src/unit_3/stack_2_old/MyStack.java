package unit_3.stack_2_old;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaogang
 * @date 2019/2/20 17:38
 */
public class MyStack {
    private List list = new ArrayList();
    synchronized public void push(){
        System.out.println("MyStack.push");
        try {
            while (list.size() == 1) {
                System.out.println("push 操作中的："+ Thread.currentThread().getName()+" 线程是 wait状态");
                this.wait();
            }
            list.add("anyString  "+Math.random());
            this.notify();
            System.out.println("list size:"+list.size());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    synchronized public String pop(){
        System.out.println("MyStack.pop");
        String returnValue = "";
        try {
            //size=0，消费者线程将会进入等待状态
            while (list.size() == 0) {
                System.out.println("pop操作中的："+ Thread.currentThread().getName()+" 线程是 wait状态");
                //stack中没有数据,将当前的线程进入当前类对象的等待线程队列中，等待其他线程将数据push进去
                this.wait();
            }
            //有数据，取出数据
            returnValue = ""+list.get(0);
            list.remove(0);
            //第一次到这里执行完，stack中就没有数据了，size=0,但是生产者线程因为加了1个之后就进入了“等待”状态
            //消费者线程在消费了之后，需要让生产者线程进入“就绪”状态，否则stack中没有数据产生，生产者和消费者
            //都将进入等待状态，程序将会假死
            //只有生产者生产完了通知消费者有数据了，消费者消费完了，通知生产者生产数据，程序才会执行下去
            System.out.println("pop list size;"+list.size());
            //此时，当对象只有一个处于“等待”状态的线程，所以，通知一个就等于通知了生产者
            this.notify();
        }catch (Exception e){
            e.printStackTrace();
        }
        return returnValue;
    }
}
