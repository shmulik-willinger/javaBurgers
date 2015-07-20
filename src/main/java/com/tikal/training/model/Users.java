package com.tikal.training.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

    @Column(name = "name")
    private String Name;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "mail")
    private String Mail;

    @Column(name = "cibus_number")
    private String cibusNumber;

    @Column(name = "cibus_daily_limit")
    private String cibusDailyLimit;

    @Column(name = "status")
    private String Status;

    @OneToMany(fetch = FetchType.EAGER, cascade= CascadeType.ALL)
    @JoinColumn(name="user_id")
    private List<Phones> phones;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public String getCibusNumber() {
        return cibusNumber;
    }

    public void setCibusNumber(String cibusNumber) {
        this.cibusNumber = cibusNumber;
    }

    public String getCibusDailyLimit() {
        return cibusDailyLimit;
    }

    public void setCibusDailyLimit(String cibusDailyLimit) {
        this.cibusDailyLimit = cibusDailyLimit;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public List<Phones> getPhones() {
        return phones;
    }

    public void setPhones(List<Phones> phones) {
        this.phones = phones;
    }
}
