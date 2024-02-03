package com.codepresso.codepressoblog.mapper;

import com.codepresso.codepressoblog.vo.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PostMapper {
    List<Post> findAll();

    List<Post> findByPage(@Param("limit") Integer limit, @Param("offset") Integer offset);
    //@Param 어노테이션을 사용하면 맵퍼 xml의 동적 데이터명으로 매핑된다.
}
