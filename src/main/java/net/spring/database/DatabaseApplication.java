package net.spring.database;

import net.spring.database.entity.Student;
import net.spring.database.repository.IStudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class DatabaseApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(DatabaseApplication.class, args);

		IStudentRepository bean = context.getBean(IStudentRepository.class);

		//Student student=new Student(null,"osman","sakat",511L,23L);

		//Student save=bean.save(student);

		Student student1= bean.findByName("go");
		System.out.println(student1);

		Student student2=bean.findStudentByNameSAndSurname("osman","sakat");
		System.out.println(student2);
	}

}
