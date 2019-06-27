package cn.jayfang.domain;

/**
 * 这是一个管理类
 */
public class Manager {

    //性别
    private String Sex;
    //姓名
    private String name;
    //权限角色
    private String role;

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
