package org.zrw.spi;

/**
 * @Author zrw1404644784@gmail.com
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