package cn.edu.zjut.po;

import java.util.Date;

public class Customer implements java.io.Serializable {
    private int customerId;
    private String account;
    private String password;
    private String name;
    private Boolean sex;
    private Date birthday;
    private String phone;
    private String email;
    private String address;
    private String zipcode;
    private String fax;

    public Customer() {
    }
    public Customer(int customerId) {
        this.customerId = customerId;
    }
    public Customer(int customerId, String account, String password,
                    String name, Boolean sex, Date birthday, String phone,
                    String email, String address, String zipcode, String fax) {
        this.customerId = customerId;
        this.account = account; this.password = password;
        this.name = name; this.sex = sex;
        this.birthday = birthday; this.phone = phone;
        this.email = email; this.address = address;
        this.zipcode = zipcode; this.fax = fax;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSex(Boolean sex) {
        this.sex = sex;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    public void setFax(String fax) {
        this.fax = fax;
    }

    public int getCustomerId() {
        return customerId;
    }
    public String getAccount() {
        return account;
    }
    public String getPassword() {
        return password;
    }
    public String getName() {
        return name;
    }
    public Boolean getSex() {
        return sex;
    }
    public Date getBirthday() {
        return birthday;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
    public String getAddress() {
        return address;
    }
    public String getZipcode() {
        return zipcode;
    }
    public String getFax() {
        return fax;
    }
}