package com.lsrcb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lsrcb.dao")
public class KjbReportApplication {

	public static void main(String[] args) {
		SpringApplication.run(KjbReportApplication.class, args);
	}
}
