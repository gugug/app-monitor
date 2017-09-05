package com.koo.appmonitor.config;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.*;
import org.springframework.core.io.ClassPathResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by gucailiang on 2017/8/22.
 */
@Configuration
@ComponentScan("com.koo.appmonitor")
@EnableTransactionManagement
public class SpringRootConfig {

}
