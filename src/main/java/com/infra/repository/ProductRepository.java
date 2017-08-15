package com.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infra.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
