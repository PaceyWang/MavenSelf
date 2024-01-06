package com.pacey.maven;

import com.pacey.maven.domain.User;

/**
 * @author Pacey &#x738B;&#x57F9;&#x8D24
 * @version 1.0
 * @date 2024-01-06 20:28:08
 * @description 测试
 * @since 1.0
 */
public class WarTest {
    @org.junit.jupiter.api.Test
    public void testWar() {
        System.out.println("测试war包中是否包含测试程序文件...");
        User pacey = new User(1, "Pacey", "123456");
        System.out.println("引用本项目中install的jar包中类创建的对象" + pacey);
    }
}
