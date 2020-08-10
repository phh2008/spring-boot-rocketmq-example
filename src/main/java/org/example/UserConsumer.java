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
@RocketMQMessageListener(topic = "${demo.rocketmq.topic}", consumerGroup = "user_consumer", selectorExpression = "tagC")
public class UserConsumer implements RocketMQListener<User> {

    public void onMessage(User message) {
        System.out.printf("------- UserReplyConsumer received: %s \n", message);
    }
}
