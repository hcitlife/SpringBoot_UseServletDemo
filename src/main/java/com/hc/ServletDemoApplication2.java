package com.hc;

import com.hc.servlet.MyServlet2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServletDemoApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(ServletDemoApplication2.class, args);
    }

    //代码方式注册Servlet
    @Bean
    public  ServletRegistrationBean getServletRegistrationBean(){
        ServletRegistrationBean<MyServlet2> bean = new ServletRegistrationBean<>(new MyServlet2());
        bean.addUrlMappings("/fun2");
        return bean;
    }

}
