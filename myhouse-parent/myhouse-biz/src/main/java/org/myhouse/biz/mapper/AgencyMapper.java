package org.myhouse.biz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.myhouse.common.model.Agency;
import org.myhouse.common.model.User;


@Mapper
public interface AgencyMapper {
  
    List<Agency> select(@Param("agency")Agency agency);

    int insert(Agency agency);


	Long selectAgentCount(@Param("user")User user);

}
