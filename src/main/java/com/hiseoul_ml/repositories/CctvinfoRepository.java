package com.hiseoul_ml.repositories;

import java.security.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hiseoul_ml.model.Cctvinfo;

@Repository

public interface CctvinfoRepository extends JpaRepository<Cctvinfo, Timestamp>{
	public List<Cctvinfo> findAllByOrderBybizmodel_wirte_dateDesc();
}

