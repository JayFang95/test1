package cn.jayfang.domain;

/**
 * 这个一个测试模块
 */
public class User {
    //用户名
    private String username;
    //密码
    private String password;

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

    public static void main(String[] args) {
        System.out.println("修改了user的内容");
    }
}
