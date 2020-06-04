package org.meng.easycollect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * easy collect 启动类
 * @author Meng
 * @date 2020/04/01
 */
@SpringBootApplication

@EnableCaching
public class EasyCollectApplication {
    public static void main(String[] args) {
        SpringApplication.run(EasyCollectApplication.class);
    }
}
