package com.qi.qyl.guolq;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CORSFilter implements Filter {


    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        //设置跨域请求
        HttpServletResponse response = (HttpServletResponse) res;
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8080");//跨域请求的ip地址
        response.setHeader("Access-Control-Allow-Methods", "POST,GET,OPTIONS,DELETE,HEAD,PUT,PATCH");//请求方式
        response.setHeader("Access-Control-Max-Age", "36000");//用来指定预检请求的有效期
        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept,Authorization,authorization");//可携带的参数
        response.setHeader("Access-Control-Allow-Credentials", "true");
        chain.doFilter(req, response);
    }

    public void destroy() {
    }
}