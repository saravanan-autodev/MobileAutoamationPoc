package com.facebook.constants;

import com.facebook.utils.PropertyUtil;

import java.io.File;
import java.io.IOException;

public class EnvironmentConstants {

    public static String PROPERTIES_PATH = "";

    public static String PLATFORM_NAME="platform";

    public static String PLATFORM_VERSION="platformVersion";

    public static String DEVICE_NAME="device";

    public static String APP_NAME="appName";

    public static String APPIUM_SERVER="appiumServer";

    static {
        File srcPath = null;
        try {
            srcPath=new File("src/test/resources/config");
            File envFile = new File(srcPath,"environment.properties");
            PROPERTIES_PATH = envFile.getAbsolutePath();
            PropertyUtil.loadProperties(envFile);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Environment Property not found"+srcPath);
        }
    }
}