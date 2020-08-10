package org.example;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
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
public class TestController {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    /**
     * 发送String消息
     *
     * @return
     */
    @GetMapping("/send1")
    public Object send1() {
        String des = "string-topic:tagA";
        String msg = "这是消息内容";
        //同步发送消息
        return rocketMQTemplate.syncSend(des, msg);
    }

    @GetMapping("/send2")
    public Object send2() {
        String des = "string-topic:tagB";
        String msg = "这是消息内容";
        String hashKey = "20200001";
        //发送消息并等待回应
        String receive = rocketMQTemplate.sendAndReceive(des, msg, String.class, hashKey);
        return receive;
    }

    @GetMapping("/send3")
    public Object send3() {
        User user = new User();
        user.setAge(23);
        user.setUsername("tom");
        String des = "string-topic:tagC";
        //发送自定义对象
        rocketMQTemplate.convertAndSend(des, user);
        return "send ok";
    }

}
