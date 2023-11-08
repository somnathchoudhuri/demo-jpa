package com.example.demo.repository;

import com.example.demo.model.YourEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface YourEntityRepository extends JpaRepository<YourEntity, Long> {
    @Query(value = "SELECT * FROM your_table WHERE age > :age", nativeQuery = true)
    List<YourEntity> findByAgeGreaterThan(int age);
}
