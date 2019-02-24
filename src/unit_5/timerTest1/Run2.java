package unit_5.timerTest1;

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
public class Run2 {
    public static void main(String[] args) throws Exception {
        MyTask myTask = new MyTask();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND,5);
        Timer timer = new Timer(true);
        timer.schedule(myTask,calendar.getTime());
        System.out.println("任务开始时间："+new Date().toLocaleString());
    }
}
