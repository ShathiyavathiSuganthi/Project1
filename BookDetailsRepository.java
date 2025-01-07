package com.eg.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eg.demo.entity.BookDetailsEntity;

@Repository
public interface BookDetailsRepository extends JpaRepository<BookDetailsEntity,Integer> {
	

}
