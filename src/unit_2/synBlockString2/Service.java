package unit_2.synBlockString2;

/**
 * @author xiaogang
 * @date 2019/2/18 15:41
 */
public class Service {

    private String anyString = new String();

    public void a() {
        try {
            synchronized (anyString){
                System.out.println("a begin");
                Thread.sleep(3000);
                System.out.println("a end");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    synchronized public void b(){
        System.out.println("b begin");
        System.out.println("b end");
    }
}
