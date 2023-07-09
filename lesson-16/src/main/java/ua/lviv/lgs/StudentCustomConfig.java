package ua.lviv.lgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentCustomConfig {
	
	
	@Bean(name="student")
	CRUD studentDao() {
		return new StudentDaoImpl();
	}
	
}