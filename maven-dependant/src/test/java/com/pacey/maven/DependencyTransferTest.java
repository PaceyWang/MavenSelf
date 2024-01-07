package com.pacey.maven;


import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;

/**
 * @author Pacey &#x738B;&#x57F9;&#x8D24
 * @version 1.0
 * @date 2024-01-07 11:31:22
 * @description 测试依赖传递
 * @since 1.0
 */
public class DependencyTransferTest {
    @Test
    public void testTransfer() {
        DruidDataSource dataSource = new DruidDataSource();
        System.out.println("测试通过依赖传递引用Druid" + dataSource);
        dataSource.close();
    }

}
