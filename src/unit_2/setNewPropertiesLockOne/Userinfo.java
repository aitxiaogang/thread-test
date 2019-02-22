package unit_2.setNewPropertiesLockOne;

/**
 * @author xiaogang
 * @date 2019/2/19 15:12
 */
public class Userinfo {
    private String username;
    private String password;

    public Userinfo() {
    }

    public Userinfo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
