package com.pacey.maven.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Pacey &#x738B;&#x57F9;&#x8D24
 * @version 1.0
 * @date 2024-01-06 16:12:17
 * @description 用户实体类
 * @since 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;
}
