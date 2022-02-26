package com.hiseoul_ml.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiseoul_ml.enumpkg.ServiceResult;
import com.hiseoul_ml.model.Cctvinfo;
import com.hiseoul_ml.model.ErrorResponse;
import com.hiseoul_ml.model.Result;
import com.hiseoul_ml.repositories.CctvinfoRepository;

@Service
public class CctvinfoServiceImpl implements CctvInfoService{
	
	private static final org.apache.logging.log4j.Logger logger=LogManager.getLogger(BoardServicelmpl.class);
			
			
	@Autowired
	CctvinfoRepository repository;
	     
	public Result updateCctvinfo(Cctvinfo cctvinfo) {
		Optional<Cctvinfo> search= repository.findById(cctvinfo.getcctv_uuid());
		Result result= new Result();
		if(search.isPresent()) {
			
			cctvinfo=repository.save(cctvinfo);
			result.setPayload(cctvinfo);
			
		}else {
			
			result.setError(new ErrorResponse(ServiceResult.NOTEXIST.toString()));	
		}
		
		return result;
	}
	
	public Result deleteCctvInfo(UUID cctv_uuid) {
		Result result= new Result();
		boolean isPresent= repository.findById(cctv_uuid).isPresent();
		if (!isPresent) {
			result.setError(new ErrorResponse(ServiceResult.NOTEXIST.toString()));
		}else {
			repository.deleteById(cctv_uuid);
		}
		
		return result;
	}	
	
	@Override
	public Result createCctvInfo(Cctvinfo cctvinfo) {
		cctvinfo=repository.save(cctvinfo);
		Result result=new Result();
		result.setPayload(cctvinfo);
		return result;
	}
	
	@Override 
	
	public Result retrieveCctvInfoList() {
		List<Cctvinfo> list=repository.findAllByOrderbycctvUuidDesc();
		Result result=new Result();
		result.setPayload(list);
		return result;
	}
	
	@Override
	public Result retrieveCctvInfo(UUID cctvUuid) {
		Optional<Cctvinfo> optionalCctvinfo= repository.findById(cctvUuid);
		Result result= new Result();
		if(optionalCctvinfo.isPresent()) {
		}else {
			result.setError(new ErrorResponse(ServiceResult.NOTEXIST.toString()));
		}
		return result;
	}

	@Override
	public Result updateCctvInfo(Cctvinfo cctvinfo) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
    
