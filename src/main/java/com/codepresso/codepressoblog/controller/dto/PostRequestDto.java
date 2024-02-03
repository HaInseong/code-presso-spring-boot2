package com.codepresso.codepressoblog.controller.dto;

import com.codepresso.codepressoblog.vo.Post;
import lombok.Setter;

@Setter
public class PostRequestDto {
    Integer id;
    String title;
    String content;
    String username;

    public Post getPost() {
        return new Post(this.id, this.title, this.content, this.username);
    }
    //PostRequestDto로부터 Post 객체를 만든다.
}
