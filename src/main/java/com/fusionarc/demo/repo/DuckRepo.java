package com.fusionarc.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fusionarc.demo.entity.Duck;
	
@Repository
public interface DuckRepo extends JpaRepository<Duck, Long>{

}

