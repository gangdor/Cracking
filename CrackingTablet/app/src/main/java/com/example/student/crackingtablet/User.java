package com.example.student.crackingtablet;

public class User {
    String id;
    String pwd;
    String name;
    int manager;
    String rdate;
    int img;
    int conn;
    int login;
    int motion;

    public User() {
    }

    public User(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    public User(String id, String pwd, String name, String rdate, int img, int conn) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.rdate = rdate;
        this.img = img;
        this.conn = conn;
    }

    //img 나중에 만들기
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getManager() {
        return manager;
    }

    public void setManager(int manager) {
        this.manager = manager;
    }

    public String getRdate() {
        return rdate;
    }

    public void setRdate(String rdate) {
        this.rdate = rdate;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getConn() {
        return conn;
    }

    public void setConn(int conn) {
        this.conn = conn;
    }

    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public int getMotion() {
        return motion;
    }

    public void setMotion(int motion) {
        this.motion = motion;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", manager=" + manager +
                ", rdate='" + rdate + '\'' +
                ", img=" + img +
                ", conn=" + conn +
                ", login=" + login +
                ", motion=" + motion +
                '}';
    }
}
