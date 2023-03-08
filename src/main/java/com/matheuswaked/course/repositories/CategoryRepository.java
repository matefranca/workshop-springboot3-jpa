package com.matheuswaked.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheuswaked.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
