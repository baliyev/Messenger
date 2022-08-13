package bean;

public class Client {

    private int userRole;
    private String userNickName;
    private String username;
    private String password;
    private boolean isAdmin;

    public int getUserRole() {
        return userRole;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setUserRole(int userRole) {
        this.userRole = userRole;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

}
