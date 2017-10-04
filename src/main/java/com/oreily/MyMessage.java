package com.oreily;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Александр on 04.10.2017.
 */
@Component
public class MyMessage {

    @Value("${my.messageValue}")
    private int messageValue;

    public int getMessageValue() {
        return messageValue;
    }

    public void setMessageValue(int messageValue) {
        this.messageValue = messageValue;
    }

}
