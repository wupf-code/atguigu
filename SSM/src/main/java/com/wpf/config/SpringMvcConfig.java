package com.wpf.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/19 - 15:53
 * @projectName:尚硅谷javaweb
 */

@Configuration
@ComponentScan("com.wpf.controller")
@EnableWebMvc
public class SpringMvcConfig {
}
