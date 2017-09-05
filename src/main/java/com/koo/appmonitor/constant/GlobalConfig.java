package com.koo.appmonitor.constant;

import jdk.nashorn.internal.objects.annotations.Property;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GlobalConfig {

    public static String RECORD_DIR = "Record/record.txt";

    public GlobalConfig() {
        RECORD_DIR = getValue("RECORD.PATH");
    }

    private static Properties prop = new Properties();

    static {
        ClassLoader loader = GlobalConfig.class.getClassLoader();
        InputStream in = loader.getResourceAsStream("app-config.properties");
        try {
            prop.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getValue(String key) {
        return prop.getProperty(key);
    }

}
