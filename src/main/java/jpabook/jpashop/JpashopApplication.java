package jpabook.jpashop;

import com.fasterxml.jackson.datatype.hibernate5.jakarta.Hibernate5JakartaModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.stream.Stream;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {
//		Hello hello = new Hello();
//		hello.setHello("hello");
//		String data = hello.getHello();
//		System.out.println("data = " + data);

		SpringApplication.run(JpashopApplication.class, args);
	}

	@Bean
	Hibernate5JakartaModule hibernate5Module() {
		//강제 지연 로딩 설정
		Hibernate5JakartaModule hibernate5JakartaModule = new Hibernate5JakartaModule();
		//hibernate5JakartaModule.configure(Hibernate5JakartaModule.Feature.FORCE_LAZY_LOADING, true);
		return hibernate5JakartaModule;
	}
}
