package com.hiseoul_ml.service;

import java.util.List;
import java.util.Optional;

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
		Optional<Cctvinfo> search= repository.findById(cctvinfo.getCctv_uuid());
		Result result= new Result();
		if(search.isPresent()) {
			
			cctvinfo=repository.save(cctvinfo);
			result.setPayload(cctvinfo);
			
		}else {
			
			result.setError(new ErrorResponse(ServiceResult.NOTEXIST.toString()));	
		}
		
		return result;
	}
	
	public Result deleteCctvInfo(String cctv_uuid) {
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
		com.hiseoul_ml.model.Result result=new Result();
		result.setPayload(cctvinfo);
		return result;
	}
	
	@Override 
	
	public Result retrieveCctvInfoList() {
		List<Cctvinfo> list=repository.findAllByOrderbycctv_uuidDesc();		
		Result result= new Result();
		result.setPayload(list);
		return result;
	}
	
	@Override
	public Result retrieveCctvInfo(String cctv_info_uuid) {
		Optional<Cctvinfo> optionalCctvinfo= repository.findById(cctv_uuid);
		Result result= new Result();
		if(optionalCctvinfo.isPresent()) {
		}else {
			result.setError(new ErrorResponse(ServiceResult.NOTEXIST.toString()));
		}
		return result;
	}
	
}
    
