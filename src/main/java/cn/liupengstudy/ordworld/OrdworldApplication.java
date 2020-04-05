package cn.liupengstudy.ordworld;

import cn.liupengstudy.ordworld.pojo.FileProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@SpringBootApplication
@EnableConfigurationProperties({FileProperties.class})
public class OrdworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrdworldApplication.class, args);
    }

}
