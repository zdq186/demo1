package com.zdq.filter;

import org.slf4j.MDC;
import org.springframework.context.annotation.ComponentScan;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by zhoudeqiang on 2017/5/18.
 */
@WebFilter(filterName = "logFilter",urlPatterns = "/*")
public class LogFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        MDC.put("ctxLogId",System.currentTimeMillis()+"");
        filterChain.doFilter(servletRequest,servletResponse);
        MDC.remove("ctxLogId");
    }

    @Override
    public void destroy() {

    }
}
