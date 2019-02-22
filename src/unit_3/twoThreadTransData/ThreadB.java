package unit_3.twoThreadTransData;

/**
 * @author xiaogang
 * @date 2019/2/19 17:24
 */
public class ThreadB extends Thread {
    volatile private MyList list;

    public ThreadB(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (list.size1() == 5) {
                    System.out.println("==5了，线程B要退出了");
                    throw new InterruptedException();
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
