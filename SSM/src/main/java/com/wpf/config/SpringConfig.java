package com.wpf.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: 武鹏飞
 * @user:ASUS
 * @date:2022/7/19 - 15:31
 * @projectName:尚硅谷javaweb
 */

@Configuration
@ComponentScan({"com.wpf.service","com.wpf.dao"})
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MyBatisConfig.class})
@EnableTransactionManagement()
public class SpringConfig {

}
