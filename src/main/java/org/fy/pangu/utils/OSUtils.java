package org.fy.pangu.utils;

public class OSUtils {

    public static boolean isWindows(){
        String osName = System.getProperty("os.name");
        return osName.startsWith("Windows");
    }
}
