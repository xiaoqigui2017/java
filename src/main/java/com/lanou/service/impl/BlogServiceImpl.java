package com.lanou.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanou.bean.Blog;

import com.lanou.mapper.BlogMapper;
import com.lanou.mapper.UserMapper;

import com.lanou.service.BlogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class BlogServiceImpl implements BlogService{
    @Resource
    private BlogMapper mapper;


    public List<Blog> findAllBlog(){
        return mapper.findAllBlog();
    }

    public void addBlog(Blog blog) {
        mapper.addBlog(blog);
    }

    public PageInfo<Blog> queryPage(Integer pageNum, Integer pageSize) {

        pageNum=pageNum==null?1:pageNum;
        pageSize=pageSize==null?2:pageSize;
        PageHelper.startPage(pageNum,pageSize);
        List<Blog> list = mapper.findAllBlog();
        PageInfo<Blog> pageInfo = new PageInfo<Blog>(list);
        return pageInfo;
    }

    public List<Blog> findAllBlogByUserId(Integer userId) {
        return mapper.findAllBlogByUserId(userId);
    }

    public Blog findBlogById(Integer id) {
        return mapper.findBlogById(id);
    }

    public Integer deleteById(Integer id) {
        Integer count = mapper.deleteById(id);

        return   id;
    }

    public List<Blog> selectLike(String str) {
        String str1= "%"+str+"%";
        System.out.println(str1);
        return mapper.selectLike(str1);
    }

}












