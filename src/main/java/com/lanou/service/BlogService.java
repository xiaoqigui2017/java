package com.lanou.service;


import com.github.pagehelper.PageInfo;
import com.lanou.bean.Blog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlogService {

    List<Blog> findAllBlog();

    void addBlog(Blog blog);

    PageInfo<Blog> queryPage(Integer pageNum, Integer pageSize);

    List<Blog> findAllBlogByUserId(Integer userId);

    Blog findBlogById(Integer id);

//    Integer deleteById(Integer id);


}
