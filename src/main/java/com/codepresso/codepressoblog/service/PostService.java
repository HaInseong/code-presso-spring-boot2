package com.codepresso.codepressoblog.service;

import com.codepresso.codepressoblog.mapper.PostMapper;
import com.codepresso.codepressoblog.vo.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private PostMapper postMapper;

    //생성자 의존성 주입
    public PostService(PostMapper postMapper) {
        this.postMapper = postMapper;
    }

    public List<Post> getAllPost() {
        return postMapper.findAll();
    }

    public List<Post> getPostByPage(Integer page, Integer size) {
        return postMapper.findByPage(size, (page-1)*size); //매개변수로 들어온 page와 size를 기반으로 offset을 계산함.
    }
}
