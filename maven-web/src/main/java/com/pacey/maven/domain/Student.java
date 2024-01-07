package com.pacey.maven.domain;

import com.alibaba.druid.pool.DruidDataSource;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * @author Pacey &#x738B;&#x57F9;&#x8D24
 * @version 1.0
 * @date 2024-01-07 9:36:53
 * @description 测试依赖范围
 * @since 1.0
 */
public class Student {
    public void sayHello() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.close();
        Servlet servlet = new HttpServlet() {
            @Override
            public void service(ServletRequest request, ServletResponse response)
                    throws ServletException, IOException {
                System.out.println("Service method");
            }
        };
    }
}
