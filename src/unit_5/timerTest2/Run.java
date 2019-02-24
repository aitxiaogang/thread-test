package unit_5.timerTest2;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xiaogang
 * @date: 2019/2/24 13:55
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Run {
    public static void main(String[] args) throws Exception {
        System.out.println("当前时间为："+new Date());
        MyTask myTask = new MyTask();
        Timer timer = new Timer();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.SECOND,calendar.get(Calendar.SECOND) - 10);
        System.out.println("任务计划时间："+calendar.getTime().toLocaleString());
        timer.schedule(myTask,calendar.getTime());
        System.out.println("任务开始时间："+new Date().toLocaleString());
    }
}
