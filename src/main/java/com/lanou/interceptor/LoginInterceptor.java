package com.lanou.interceptor;


import com.lanou.bean.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {


    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {

////        可以根据请求的URI来确定是否拦截
//        String uri = httpServletRequest.getRequestURI();
//        if (uri.indexOf("login")>0){
//            return true;
//        }


//       靠session来判断用户是否登录
        HttpSession session = httpServletRequest.getSession();
        User user = (User) session.getAttribute("user");
        if (user!=null){
            return true;
        }
        httpServletRequest.getRequestDispatcher("/WEB-INF/pages/user/login.jsp").forward(httpServletRequest,httpServletResponse);
        return false;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
