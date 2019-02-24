package unit_5.taskLater;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xiaogang
 * @date: 2019/2/24 14:33
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Test {
    public static void main(String[] args) throws Exception {
        System.out.println("当前时间为："+new Date());
        Calendar instance = Calendar.getInstance();
        Date runDate = instance.getTime();
        System.out.println("A计划时间为："+runDate);

        Calendar instance2 = Calendar.getInstance();
        instance2.add(Calendar.SECOND,10);
        Date runDate2 = instance2.getTime();
        System.out.println("B计划时间为："+runDate2);

        MyTaskA taskA = new MyTaskA();
        MyTaskB taskB = new MyTaskB();
        Timer timer = new Timer();

        timer.schedule(taskA,runDate);
        timer .schedule(taskB,runDate2);

    }
}
