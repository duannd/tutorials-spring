package com.duannd.spring.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created By duan.nguyen
 */
@Component
public class AppArgumentBean {

    @Autowired
    public AppArgumentBean(ApplicationArguments args) {
        String[] argsValue = args.getSourceArgs();
        if (argsValue != null) {
            System.out.println("Print arguments: " + Arrays.toString(argsValue));
        }
    }

}
