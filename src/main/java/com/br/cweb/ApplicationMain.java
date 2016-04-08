package com.br.cweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring boot 启动类，有且只有一个 
 * @author guanghao.wang@100credit.com
 *
 */

@SpringBootApplication
public class ApplicationMain {
	public static void main(String[] args){
		SpringApplication.run(ApplicationMain.class, args);
	}
}
