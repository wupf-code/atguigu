package com.wpf.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/6 - 17:22
 * @projectName:尚硅谷javaweb
 */
public class ServletContainerInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvc.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
