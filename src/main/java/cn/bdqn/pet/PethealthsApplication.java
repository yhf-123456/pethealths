package cn.bdqn.pet;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.bdqn.pet.mapper")
public class PethealthsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PethealthsApplication.class, args);
    }

}
