package unit_2.t3;

/**
 * @author xiaogang
 * @date 2019/2/14 18:18
 */
public class PublicVar {
    public String username = "A";
    public String password = "AA";

    synchronized public void setValue(String username,String password){
        try {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;
            System.out.println("setValue method thread name="+Thread.currentThread().getName()+"  username = " + username+"  password = " + password);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /*synchronized*/ public void getValue(){
        System.out.println("getValue method thread name="+Thread.currentThread().getName()+"  username = " + username+"  password = " + password);
    }

}
