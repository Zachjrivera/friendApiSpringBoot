package com.zach.demofriendsapi.domain;

public class Friends {
    private Long id;
    private String name;
    private String nickname;


    public Friends(){}

    public Friends(Long id, String name, String nickname) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Friends{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
