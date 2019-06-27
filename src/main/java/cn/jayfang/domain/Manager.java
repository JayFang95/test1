package cn.jayfang.domain;

/**
 * 这是一个管理类
 */
public class Manager {

    //性别
    private String Sex;
    //姓名
    private String username;
    //权限角色
    private String role;

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
