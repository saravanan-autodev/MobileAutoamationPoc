package com.facebook.runner;

import com.facebook.utils.PropertyUtil;
import static com.facebook.constants.EnvironmentConstants.*;

public class Main {

    public static void main(String[] args){
        System.out.println(PropertyUtil.getProperty(PLATFORM_NAME));
    }
}
