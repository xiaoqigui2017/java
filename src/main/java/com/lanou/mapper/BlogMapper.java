package com.lanou.mapper;


import com.lanou.bean.Blog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlogMapper {



     List<Blog> findAllBlog();
     void addBlog(Blog blog);
     List<Blog> findAllBlogByUserId(@Param("userId") Integer userId);

     Blog  findBlogById(@Param("id")Integer id);

     Integer deleteById(@Param("id")Integer id );


     List<Blog> selectLike(@Param("str") String str);

}
