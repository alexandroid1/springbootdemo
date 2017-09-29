package com.oreily;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Александр on 29.09.2017.
 */

@Configuration
public class MyConfiguration {

    @Bean
    public String message(){
        return "Hello OReily";
    }
}
