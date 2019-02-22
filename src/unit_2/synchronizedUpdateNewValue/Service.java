package unit_2.synchronizedUpdateNewValue;

/**
 * @author xiaogang
 * @date 2019/2/19 16:51
 */
public class Service {
    private boolean isContinueRun = true;

    public void runMethod(){
        String anyString = new String();
        while (isContinueRun == true) {
            synchronized (anyString) {

            }
        }
        System.out.println("停下来了！");
    }
    public void stopMethod(){
        isContinueRun = false;
    }
}
