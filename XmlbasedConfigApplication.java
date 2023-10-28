package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.config.AppConfig;
import com.example.demo.model.Employee;
import com.google.gson.Gson;

@SpringBootApplication
public class XmlbasedConfigApplication {

	@Autowired
	AppConfig appconfig;
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(XmlbasedConfigApplication.class, args);
		
//		/// XML Based Config then only we go with ClassPathXmlApplicationContext
////		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext123.xml");
////		
////		Employee emp = (Employee) app.getBean("emp_id");
//
//        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext123.xml");
//
//		Employee emp = (Employee) factory.getBean("emp_id");
		Gson gson = new Gson();

		AppConfig  appp = new AppConfig();
		
		System.err.println(gson.toJson(appp.getEmployee()));
		
	}

}
