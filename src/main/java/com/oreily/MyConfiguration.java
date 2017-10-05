package com.oreily;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by Александр on 29.09.2017.
 */

//@Configuration
public class MyConfiguration {

/*    @Bean
    public String message(){
        return "Hello OReily";
    }*/

   // @Bean
    public MyMessage myMessage(@Value("${my.messageValue}") String messageValue){
        MyMessage myMessage = new MyMessage();
        myMessage.setMessageValue(messageValue);
        return myMessage;
    }

}
