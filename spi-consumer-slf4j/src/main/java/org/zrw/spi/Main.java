package org.zrw.spi;

/**
 * @Author Ruwang.zhang@hand.china.com
 * @Date 2024/4/2 14:55
 * @Description ${NAME}类
 */
public class Main {
    public static void main(String[] args) {
        LoggerService service = LoggerService.getService();
        service.info("Hello SPI");
        service.debug("Hello SPI");
    }
}