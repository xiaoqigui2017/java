package com.lanou.mapper;


import com.lanou.bean.Blog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlogMapper {



     List<Blog> findAllBlog();
     void addBlog(Blog blog);
     List<Blog> findAllBlogByUserId(@Param("userId") Integer userId);

     Blog  findBlogById(@Param("id")Integer id);








}
