package com.lanou.controller;

import com.github.pagehelper.PageInfo;
import com.lanou.bean.Blog;
import com.lanou.bean.User;
import com.lanou.service.BlogService;

import com.lanou.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {

    @Resource
    private BlogService blogService;
    @Resource
    private UserService userService;


    @RequestMapping(value = "/showBlogPage")
    public String showBlogPage() {
        return "/blog/showblog";
    }


    @RequestMapping(value = "/showBlogTitle")
    @ResponseBody
    public Blog showBlogTitle(@RequestParam("titleId") Integer titleId) {
        Blog blog = blogService.findBlogById(titleId);
        return blog;
    }


    @RequestMapping(value = "/showBlogTitlePage")
     public String showBlogTitlePage() {

        return "/blog/showblogtitle";
    }

    @RequestMapping(value = "/addBlogPage")
    public String addblog() {
        return "/blog/addblog";
    }


    @RequestMapping(value = "/")
    public String loginPage() {
        return "/user/login";
    }

    @RequestMapping(value = "/registerPage")
    public String registerPage() {
        return "/user/register";
    }

    @RequestMapping(value = "/login")
    public String login(HttpServletRequest request,
                        @RequestParam("username") String name,
                        @RequestParam("password") String password) {
        User user = userService.login(name, password);
        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            return "redirect:showBlogPage";
        }
        return "redirect:/";
    }

    @RequestMapping(value = "/register")
    public String register(User user, @Param("passwordAgain") String passwordAgain) {
        Integer i = userService.register(user);
        return "redirect:/";
    }

    @RequestMapping(value = "/getAllById")
    @ResponseBody
    public List<Blog> getAllById(HttpServletRequest request) {
//        User user = (User) request.getSession().getAttribute("user");
//        List<Blog> blogList = blogService.findAllBlogByUserId(user.getId());
        List<Blog> blogList = blogService.findAllBlog();
        return blogList;
    }

    @RequestMapping(value = "/addBlog")
    public String addBlog(HttpServletRequest request, Blog blog) {
        User user = (User) request.getSession().getAttribute("user");
        blog.setUserId(user.getId());
        blogService.addBlog(blog);
        return "redirect:showBlogPage";
    }

    @RequestMapping(value = "/pagetest")
    @ResponseBody
    public PageInfo<Blog> pagetest(@RequestParam("pagenum") Integer pagenum,
                                   @RequestParam("pagesize") Integer pagesize) {
        PageInfo<Blog> blogPageInfo = blogService.queryPage(pagenum, pagesize);
        return blogPageInfo;
    }



    @RequestMapping(value = "/deleteById")
    @ResponseBody
    public Map<String, Object> deleteById(@RequestParam("deleteById") Integer id) {

        blogService.deleteById(id);
        Map<String ,Object> map = new HashMap<String, Object>();


        return map;
    }














}
