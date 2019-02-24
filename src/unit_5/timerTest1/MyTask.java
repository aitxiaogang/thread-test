package unit_5.timerTest1;

import java.util.Date;
import java.util.TimerTask;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xiaogang
 * @date: 2019/2/24 13:52
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class MyTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("任务执行了，时间为："+new Date().toLocaleString());
    }
}
