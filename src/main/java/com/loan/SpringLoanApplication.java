package com.loan;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.loan.utility.TYPE;

import sun.net.www.protocol.http.AuthCacheValue.Type;

@SpringBootApplication
public class SpringLoanApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringLoanApplication.class, args);

//		System.out.println(Arrays.stream(TYPE.values()).filter(val1 -> val1.name().equalsIgnoreCase("student"))
//				.findFirst().get().getRate());
	}
}
