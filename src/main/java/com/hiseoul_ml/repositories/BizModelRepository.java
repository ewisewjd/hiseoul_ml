package com.hiseoul_ml.repositories;

import java.security.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hiseoul_ml.model.Bizmodel;

@Repository

public interface BizModelRepository extends JpaRepository<Bizmodel, Timestamp>{
	public List<Bizmodel> findAllByOrderBybizmodel_wirte_dateDesc();
}


