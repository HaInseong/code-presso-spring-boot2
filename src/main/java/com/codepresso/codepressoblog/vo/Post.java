package com.codepresso.codepressoblog.vo;

import java.util.Date;

public class Post {
    //마이바티스에서 쿼리를 날릴 때 사용하는 데이터이기도 하고
    //쿼리를 날린 결과의 반환값을 담는 객체 데이터이기도 하다.
    //마이바티스 뿐만아니라 컨트롤러, 서비스, 맵퍼 계층 서로 데이터를 주고 받는 용도의 객체.
    Integer id;
    String title;
    String content;
    String username;
    Date createAt;

    public Post(Integer id, String title, String content, String username) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.username = username;
    }

    public Post(Integer id, String title, String content, String username, Date createAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.username = username;
        this.createAt = createAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
