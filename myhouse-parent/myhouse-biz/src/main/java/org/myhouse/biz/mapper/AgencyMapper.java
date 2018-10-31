package org.myhouse.biz.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.myhouse.common.model.Agency;

@Mapper
public interface AgencyMapper {

	public List<Agency> select();
	
}
