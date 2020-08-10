package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述
 *
 * @author huihui.peng
 * @version V1.0
 * @date 2020/7/29
 */
@RestController
@SpringBootApplication
public class RocketmqExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(RocketmqExampleApplication.class, args);
    }


    @GetMapping({"", "/"})
    public String index() {
        return "hi";
    }

}
