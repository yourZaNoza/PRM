package rpm_11.serialization;

import java.io.Serializable;

public class Account implements Serializable {
    private Long id;
    private String name;
    private Integer age;
    private String phone;
    private Bill bill;
    private transient String mail;

    public Account(Long id, String name, Integer age, String phone, String mail, Bill bill) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.mail = mail;
        this.bill =bill;
    }
//    public Account() {
//        this.id = 0L;
//        this.name = "Unknown";
//        this.age = 0;
//        this.phone = "Unknown";
//        this.mail = "Unknown";
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

