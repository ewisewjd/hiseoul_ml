package com.hiseoul_ml.repositories;

import java.security.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hiseoul_ml.model.Region;

@Repository

public interface RegionRepository extends JpaRepository<Region, Timestamp>{
	public List<Region> findAllByOrderBybizmodel_wirte_dateDesc();
}

