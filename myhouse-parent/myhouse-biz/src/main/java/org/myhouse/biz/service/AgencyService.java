package org.myhouse.biz.service;

import java.util.List;

import org.myhouse.biz.mapper.AgencyMapper;
import org.myhouse.common.model.Agency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgencyService {
	
	@Autowired
	private AgencyMapper agencyMapper;
	public List<Agency>  getAllAgency(){
		return agencyMapper.select();
	}

}
