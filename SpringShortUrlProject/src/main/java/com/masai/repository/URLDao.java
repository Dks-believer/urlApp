package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.models.URLs;

@Repository
public interface URLDao extends JpaRepository<URLs, Integer>{

}
