package com.br.backend;

import com.br.backend.integration.response.LineResponse;
import com.br.backend.integration.response.dto.LineDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

//		try {
//			LineResponse test = LineResponse.class.getDeclaredConstructor().newInstance();
//			System.out.println(test.lines);
//			System.out.println(test.result);
//		} catch (Exception e) {
//			throw new RuntimeException(e);
//		}
	}
}
