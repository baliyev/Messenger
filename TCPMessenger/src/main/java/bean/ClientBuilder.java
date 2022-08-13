/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author bilan
 */
public class ClientBuilder {

    private int userRole;
    private String userNickName;
    private String username;
    private String password;
    private boolean isAdmin;

    public ClientBuilder setUserRole(int userRole) {
        this.userRole = userRole;
        return this;
    }

    public ClientBuilder setUserNickName(String userNickName) {
        this.userNickName = userNickName;
        return this;
    }

    public ClientBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public ClientBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public ClientBuilder setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }

    public Client build() {
        Client client = new Client();
        client.setIsAdmin(this.isAdmin);
        client.setPassword(this.password);
        client.setUserNickName(this.userNickName);
        client.setUserRole(this.userRole);
        client.setUsername(this.username);

        return client;
    }

}
