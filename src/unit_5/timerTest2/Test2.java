package unit_5.timerTest2;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xiaogang
 * @date: 2019/2/24 14:24
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        System.out.println("当前时间为："+new Date());
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.SECOND,10);
        Date time = instance.getTime();
        System.out.println("计划时间为："+time);

        Calendar instance2 = Calendar.getInstance();
        instance2.add(Calendar.SECOND,15);
        Date time2 = instance2.getTime();
        System.out.println("计划时间为："+time2);

        Timer timer = new Timer();
        MyTask myTask = new MyTask();
        MyTask myTask2 = new MyTask();
        timer.schedule(myTask,time);
        timer.schedule(myTask2,time2);

    }
}
