package org.example;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.apache.rocketmq.spring.core.RocketMQReplyListener;
import org.springframework.stereotype.Service;

/**
 * 描述
 *
 * @author huihui.peng
 * @version V1.0
 * @date 2020/7/30
 */
@Service
@RocketMQMessageListener(topic = "${demo.rocketmq.topic}", consumerGroup = "string_reply_consumer", selectorExpression = "tagB")
public class StringReplyConsumer implements RocketMQReplyListener<String,String> {

    public String onMessage(String message) {
        System.out.printf("------- StringReplyConsumer received: %s \n", message);
        return "reply string";
    }
}
