package com.matheuswaked.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheuswaked.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
