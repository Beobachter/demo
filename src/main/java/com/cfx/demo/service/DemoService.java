package com.cfx.demo.service;

import com.cfx.demo.controller.DemoController;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.DispatcherServlet;

@Service
public class DemoService implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public String demo() {
//        System.out.println("------------------------------");
        DemoService bean = applicationContext.getBean(DemoService.class);
        DispatcherServlet bean1 = applicationContext.getBean(DispatcherServlet.class);

        WebApplicationContext rootWac= ContextLoader.getCurrentWebApplicationContext();
        WebApplicationContext wac= WebApplicationContextUtils.
                getWebApplicationContext(rootWac.getServletContext(),
                        "org.springframework.web.servlet.FrameworkServlet.CONTEXT.springServlet" );
        return "OK";
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
