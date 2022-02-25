package com.hiseoul_ml.service;

import java.util.UUID;

import com.hiseoul_ml.model.Cctvinfo;
import com.hiseoul_ml.model.Result;

public interface CctvInfoService {
	public Result createCctvInfo(Cctvinfo cctvinfo);
	public Result retrieveCctvInfoList();
	public Result retrieveCctvInfo(String cctv_info_uuid);
	public Result updateCctvInfo(Cctvinfo cctvinfo);
	public Result deleteCctvInfo(String cctv_info_uuid);
}