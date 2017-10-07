package com.oreily;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Александр on 07.10.2017.
 */
@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("These are the arguments used to start the app:");
        for(String arg:strings){
            System.out.println(arg);
        }
    }
}
