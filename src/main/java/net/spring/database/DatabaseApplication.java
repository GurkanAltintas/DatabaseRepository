package net.spring.database;

import net.spring.database.entity.Student;
import net.spring.database.repository.IStudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DatabaseApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(DatabaseApplication.class, args);

		IStudentRepository bean = context.getBean(IStudentRepository.class);

		Student student=new Student(null,"go","altintas",5181L,23L);

		Student save=bean.save(student);

		Student student1= bean.findByName("go");
		System.out.println(student1);
	}

}
