package org.zrw;

import org.zrw.spi.LoggerService;

/**
 * @Author Ruwang.zhang@hand.china.com
 * @Date 2024/4/2 15:06
 * @Description ${NAME}类
 */
public class Main {
    public static void main(String[] args) {
        LoggerService loggerService = LoggerService.getService();
        loggerService.info("你好");
        loggerService.debug("测试Java SPI 机制");
    }
}