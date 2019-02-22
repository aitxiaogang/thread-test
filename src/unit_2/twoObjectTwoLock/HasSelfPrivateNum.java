package unit_2.twoObjectTwoLock;

/**
 * @author xiaogang
 * @date 2019/2/14 10:53
 */
public class HasSelfPrivateNum {
    private int num = 0;
    public synchronized void addI(String username){
        try {
            if (username.equals("a")) {
                num = 100;
                System.out.println("a set over");
            }else{
                num = 200;
                System.out.println("b set over");
            }
            System.out.println("username = "+username +" num = " + num);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
