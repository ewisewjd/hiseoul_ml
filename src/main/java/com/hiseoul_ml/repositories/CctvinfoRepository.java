package com.hiseoul_ml.repositories;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hiseoul_ml.model.Cctvinfo;

@Repository

public interface CctvinfoRepository extends JpaRepository<Cctvinfo, UUID>{
	public List<Cctvinfo> findAllByOrderbycctvUuidDesc();

	public Optional<Cctvinfo> findById(String cctv_info_uuid);
}

