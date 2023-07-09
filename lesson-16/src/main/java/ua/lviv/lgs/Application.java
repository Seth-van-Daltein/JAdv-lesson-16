package ua.lviv.lgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);

		CRUD crud = (StudentDaoImpl) ctx.getBean("student");

		// create
		crud.create(new Student(1, "Maxim", 15));
		crud.create(new Student(2, "Oksana", 39));
		crud.create(new Student(3, "Vasul", 69));
		crud.create(new Student(4, "Taras", 40));
		crud.create(new Student(5, "Kaneki", 16));

		// readAll
		crud.readAll().stream().forEach(System.out::println);

		// delete
		crud.delete(4);
		System.out.println();
		crud.readAll().stream().forEach(System.out::println);

		// readAll
//		crud.readAll().stream().forEach(System.out::println);
		
		// update
		System.out.println();
		Student student1 = crud.read(1);
		crud.update(student1).setAge(26);
		System.out.println(student1);

		// readAll
		crud.readAll().stream().forEach(System.out::println);

		// read
		System.out.println();
		System.out.println(crud.read(2));

	}
}