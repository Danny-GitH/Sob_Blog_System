package net.sunofbeach.blog.pojo;

/**
 * @Author danny
 * @Date 2021/8/9 10:25 下午
 * @Version 1.0
 */
public class TestHouse {
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    private String address;
    private String number;

    public TestHouse(String address, String number) {
        this.address = address;
        this.number = number;
    }

}
