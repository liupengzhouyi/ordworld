package cn.liupengstudy.ordworld;

import cn.liupengstudy.ordworld.entity.FileProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigurationProperties({FileProperties.class})
public class OrdworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrdworldApplication.class, args);
    }

}

// http://127.0.0.1:8080/doc.html#/home