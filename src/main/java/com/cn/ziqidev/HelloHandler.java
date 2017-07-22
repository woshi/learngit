package com.cn.ziqidev;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

/**
 * Created by Administrator on 2017/7/20.
 */
public class HelloHandler extends AbstractHandler {

    public void handle(String s, Request request, HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse) throws IOException, ServletException {
        httpServletResponse.setContentType("text/html;charset=utf-8");
        httpServletResponse.setStatus(HttpServletResponse.SC_OK);
        ((Request)httpServletRequest).setHandled(true);
        httpServletResponse.getWriter().println("<h1>hello,this is eclipse jetty</h1>");
    }
}
