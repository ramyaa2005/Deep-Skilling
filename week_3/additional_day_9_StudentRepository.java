package com.example.hql_native_query;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    // HQL Query
    @Query("SELECT s FROM Student s WHERE s.department = ?1")
    List<Student> findByDepartmentHql(String department);

    // Native SQL Query
    @Query(value = "SELECT * FROM student WHERE name = ?1", nativeQuery = true)
    List<Student> findByNameNative(String name);
}
