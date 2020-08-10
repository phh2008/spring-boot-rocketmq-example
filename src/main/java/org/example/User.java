package org.example;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * 描述
 *
 * @author huihui.peng
 * @version V1.0
 * @date 2020/7/30
 */
@Data
@ToString
public class User implements Serializable {

    private String username;
    private Integer age;

}
