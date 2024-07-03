package com.genie.JPADemo.repo;

import com.genie.JPADemo.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> { //JPARepository<Student, Integer>

    //CRUD or JPA is a marker interface repositpory where by JVM
    public List<Student> findByCourse(String course);

    @Query(value="select * from students", nativeQuery = true)
    public List<Student> getAllStudentData();
}
