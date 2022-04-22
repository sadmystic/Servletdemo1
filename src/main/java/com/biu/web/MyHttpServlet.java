package com.biu.web;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class MyHttpServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        //根据请求方式不同，分别处理
        HttpServletRequest request=(HttpServletRequest) req;
        //1. 获取请求方式
        String method=request.getMethod();
        //2. 判断
        if("GET".equals(method)){
            //get方式
            
            doGet(req,res);
        }else if("POST".equals(method)){
            //post方式

            doPost(req,res);
        }
    }

    protected void doGet(ServletRequest req, ServletResponse res) {
    }

    protected void doPost(ServletRequest req, ServletResponse res) {
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
