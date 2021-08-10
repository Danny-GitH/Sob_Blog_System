package net.sunofbeach.blog.pojo;

import java.io.Serializable;

/**
 * @Author danny
 * @Date 2021/8/9 10:14 下午
 * @Version 1.0
 */
public class TestUser implements Serializable {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    private String username;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;
    private String sex;
    private String tel;


    public TestUser (String username, String sex, String tel){
        this.sex = sex;
        this.tel = tel;
        this.username = username;
    }


    public TestHouse getTestHouse() {
        return testHouse;
    }

    public void setTestHouse(TestHouse testHouse) {
        this.testHouse = testHouse;
    }

    private TestHouse testHouse;
}
