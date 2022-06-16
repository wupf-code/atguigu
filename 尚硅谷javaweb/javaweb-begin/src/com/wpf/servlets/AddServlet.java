package com.wpf.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * &#064;author:  武鹏飞
 * &#064;user:ASUS
 * &#064;date:2022/6/16  - 20:28
 * &#064;projectName:尚硅谷javaweb
 */
@WebServlet("/add")
public class AddServlet extends HttpServlet {

    @Override
    public void doPost (HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
        String fname=request.getParameter("name");
        String price=request.getParameter("price");
        String fcount=request.getParameter("fcount");
        String remark=request.getParameter("remark");
        System.out.println(fname+" "+price+" "+fcount+" "+remark);
    }
}
