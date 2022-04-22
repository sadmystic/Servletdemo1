package com.biu.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
* urlPatterns配置规则:
* *精确匹配:"/user/select"
* *目录匹配:"/user/*"  通过"/user/aa"或"/user/bb"
* *扩展名匹配:"*.do" 通过"aaa.do"或"bbb.do"
* *任意匹配:"/*"或"/"
* */
@WebServlet(urlPatterns = "/user/select")
public class servletdemo8 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
