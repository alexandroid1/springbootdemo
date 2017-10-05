package com.oreily;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Александр on 04.10.2017.
 */
@Component
@ConfigurationProperties(prefix = "my")
public class MyMessage {

    //@Value("${my.messageValue}")
    private String messageValue;

    public String getMessageValue() {
        return messageValue;
    }

    public void setMessageValue(String messageValue) {
        this.messageValue = messageValue;
    }

}
