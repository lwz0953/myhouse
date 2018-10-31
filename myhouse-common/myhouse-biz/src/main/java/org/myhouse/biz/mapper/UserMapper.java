package org.myhouse.biz.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.myhouse.common.model.User;

@Mapper
public interface UserMapper {

	public int save(User user);
}
