package com.sqh.pojo;

public class User {
  private String username;
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

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("创建分支");
        System.out.println("主干添加");
        System.out.println("分支添加");
        System.out.println("最新添加");
        System.out.println("zhangsan");
     }
}
