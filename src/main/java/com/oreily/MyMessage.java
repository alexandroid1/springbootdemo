package com.oreily;

/**
 * Created by Александр on 04.10.2017.
 */
//@Component
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
