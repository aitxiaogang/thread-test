package unit_5.taskLater;

import java.util.Date;
import java.util.TimerTask;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: xiaogang
 * @date: 2019/2/24 14:30
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class MyTaskB extends TimerTask {
    @Override
    public void run() {
        try {
            System.out.println("B begin timer="+new Date());
            System.out.println("B end   timer="+new Date());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
