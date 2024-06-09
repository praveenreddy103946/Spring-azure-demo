package com.neverstop.neverstop;

import jakarta.annotation.Resource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/praveen")
public class NeverstopApplication {

	public static void main(String[] args) {

	SpringApplication.run(NeverstopApplication.class, args);

//		List<Integer> numbers = List.of(1, 2, 3, 4,0,5);
//		numbers.forEach(i -> {
//			try {
//				System.out.println("Number " + i);
//				System.out.println("Result " + 100 % i);
//			} catch (ArithmeticException e) {
//				System.out.println("Cannot perform modulo operation with "+i);
//			}
//		});

//		MultiThreadDemo demo = new MultiThreadDemo();
//		MultiThreadDemo demo2 = new MultiThreadDemo();
//		demo.start();
//		demo2.start();

//
//		for (int i = 0; i < 5 ;i++) {
//			MultiThreadDemo demo = new MultiThreadDemo(i);
//			demo.start();
//		}


	}


	@GetMapping("/message")
	public String getMessage(){
		return "Hey Praveen !! Your application sucessfully Deployed in Azure";
	}

}
