package net.spring.database.repository;

import net.spring.database.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IStudentRepository extends JpaRepository<Student,Long> {


    Student findByName(String name);
    @Query("select s from Student s where s.name = :name and s.surname=:surname")
    Student findStudentByNameSAndSurname(@Param("name") String name,
                                         @Param("surname") String surname);
}
