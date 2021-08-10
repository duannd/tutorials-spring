package com.duannd.spring.application;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created By duan.nguyen
 */
@Component
public class MyAppRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("My App Runner: "+ Arrays.toString(args.getSourceArgs()));
    }

}
