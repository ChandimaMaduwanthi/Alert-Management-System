package com.temperature.alert.api;

import com.temperature.alert.api.notification.EmailSender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.mail.MessagingException;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {


			String bodyData;
			//EmailSender.sentMail(bodyData: "Temperature sensor -T002 has exceed the 35C threshold and its recode is 38C");


			SpringApplication.run(Application.class, args);
	}

}
