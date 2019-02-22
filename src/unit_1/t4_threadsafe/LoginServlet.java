package unit_1.t4_threadsafe;

/**
 * @author xiaogang
 * @date 2019/2/11 15:25
 */
public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;

    public /*synchronized*/ static void doPost(String username, String password) {
        try {
            usernameRef = username;
            if ("a".equals(username)) {
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username = [" + usernameRef + "], password = [" + password + "]");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
