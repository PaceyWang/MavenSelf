package com.pacey.maven;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * @author Pacey &#x738B;&#x57F9;&#x8D24
 * @version 1.0
 * @date 2024-01-07 9:38:49
 * @description 测试Druid依赖范围
 * @since 1.0
 */
public class ScopeTest {
    @Test
    public void testDruidScope() {
        DruidDataSource dataSource = new DruidDataSource();
        System.out.println(dataSource);
        dataSource.close();
    }
    @Test
    public void testServletApiScope() {
        Servlet servlet = new HttpServlet() {
            @Override
            public void service(ServletRequest request, ServletResponse response)
                    throws ServletException, IOException {
                System.out.println("Service method");
            }
        };
        System.out.println(servlet);
    }

}
