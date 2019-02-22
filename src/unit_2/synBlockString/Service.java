package unit_2.synBlockString;

/**
 * @author xiaogang
 * @date 2019/2/18 15:41
 */
public class Service {
    private String usernameParam;

    private String passwordParam;

//    private String anyString = new String();

    public void setUsernamePassword(String username, String password) {
        try {
            String anyString = new String();
            synchronized (anyString){
                System.out.println("线程名称为："+Thread.currentThread().getName()+"在 "+System.currentTimeMillis()
                +"进入同步块 ");
                usernameParam = username;
                Thread.sleep(3000);
                passwordParam = password;
                System.out.println("线程名称为："+Thread.currentThread().getName()+"在 "+System.currentTimeMillis()
                        +"离开同步块 ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    synchronized public void prin(){
        System.out.println("Service.prin"+Thread.currentThread().getName());
    }
}
