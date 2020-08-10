package org.example;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

/**
 * 描述
 *
 * @author huihui.peng
 * @version V1.0
 * @date 2020/7/30
 */
@Service
@RocketMQMessageListener(topic = "${demo.rocketmq.topic}", consumerGroup = "string_consumer", selectorExpression = "${demo.rocketmq.tag}")
public class StringConsumer implements RocketMQListener<String> {

    public void onMessage(String message) {
        System.out.printf("------- StringConsumer received: %s \n", message);
    }
}
