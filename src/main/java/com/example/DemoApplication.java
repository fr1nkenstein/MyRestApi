package com.example;

import org.apache.catalina.core.ApplicationContext;
import org.hibernate.dialect.identity.CockroachDBIdentityColumnSupport;
import org.hibernate.id.Configurable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DemoApplication {

	@Autowired
	//public static StudentRepository studentREsRepository;                     
	public static void main(String[] args) {
		System.out.println("jai shree ram");
	ConfigurableApplicationContext context=	SpringApplication.run(DemoApplication.class, args);
//	StudentRepository student1 =context.getBean(StudentRepository.class);
//	StudentEntity s=new StudentEntity();
//	s.setStudentId(10);
//	s.setStudentName("shreyansh");
//student1.save(s);
//System.out.println(student1.findAll());
	
	
	}
	

}
