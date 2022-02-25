package com.hiseoul_ml.repositories;

import java.security.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hiseoul_ml.model.MlCase;

@Repository

public interface MlCaseRepository extends JpaRepository<MlCase, Timestamp>{
	public List<MlCase> findAllByOrderBybizmodel_wirte_dateDesc();
}

