package org.zrw.spi.service;

import org.zrw.spi.Logger;

/**
 * @Author zrw1404644784@gmail.com
 * @Date 2024/4/2 15:01
 * @Description Logback类
 */
public class Logback implements Logger {
    @Override
    public void info(String s) {
        System.out.println("Logback info 打印日志：" + s);
    }

    @Override
    public void debug(String s) {
        System.out.println("Logback debug 打印日志：" + s);
    }
}
