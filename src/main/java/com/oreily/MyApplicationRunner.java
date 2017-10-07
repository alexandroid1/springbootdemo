package com.oreily;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Александр on 07.10.2017.
 */
@Component
public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        System.out.println("These are the arguments used to start the app:");
        for(String arg:applicationArguments.getOptionNames()){
            System.out.println(arg);
        }
    }
}
