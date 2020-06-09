package com.hc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan//springboot启动时去扫描@WebServlet注解，并将该类实例化
public class ServletDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServletDemoApplication.class, args);
    }


}
