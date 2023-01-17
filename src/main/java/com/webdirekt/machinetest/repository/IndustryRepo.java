package com.webdirekt.machinetest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webdirekt.machinetest.entity.Industry;


@Repository
public interface IndustryRepo extends JpaRepository<Industry, Integer>{

}
