package com.facebook.utils;

import java.io.*;
import java.util.Properties;

public class PropertyUtil {

    static Properties envProperties;

    public static Properties loadProperties(File propPath) throws IOException {
        envProperties = new Properties();
        envProperties.load(new FileInputStream(propPath));
        return envProperties;
    }

    public static String getProperty(String propertyName){
        return envProperties.getProperty(propertyName);
    }

}
