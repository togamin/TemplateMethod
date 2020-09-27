package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.templatemethod.concrete.CookGrilledChiken;
import com.example.demo.templatemethod.concrete.CookGrilledPork;

@SpringBootApplication
public class TemplateMethodApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemplateMethodApplication.class, args);
		
		//グリルチキンの作成
		var grilledChiken = new CookGrilledChiken();
		grilledChiken.cookGrilledFood();
		
		//グリルポークの作成
		var grilledpork = new CookGrilledPork();
		grilledpork.cookGrilledFood();
	}

}
