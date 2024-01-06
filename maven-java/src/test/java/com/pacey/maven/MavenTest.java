package com.pacey.maven;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Pacey &#x738B;&#x57F9;&#x8D24
 * @version 1.0
 * @date 2024-01-06 17:54:51
 * @description 测试类必须以Test开头或结尾(建议以Test结尾，功能放后面)
 * 测试类中的测试方法必须以test(小写)开头
 * @since 1.0
 */
public class MavenTest {
    @Test
    public void testAssert() {
        int a = 10;
        int b = 20;
        Assertions.assertEquals(a + b, 30);
    }
}
