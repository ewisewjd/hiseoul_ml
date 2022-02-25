package com.hiseoul_ml.repositories;

import java.security.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hiseoul_ml.model.Menucate;

@Repository

public interface MenucateRepository extends JpaRepository<Menucate, Timestamp>{
	public List<Menucate> findAllByOrderBybizmodel_wirte_dateDesc();
}

