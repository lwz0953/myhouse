package org.myhouse.biz.service;

import java.util.List;

import org.myhouse.biz.mapper.AgencyMapper;
import org.myhouse.common.model.Agency;
import org.myhouse.common.page.PageData;
import org.myhouse.common.page.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;


@Service
public class AgencyService {

  @Autowired
  private AgencyMapper agencyMapper;

  @Value("${file.prefix}")
  private String imgPrefix;

  /**
   * 访问user表获取详情 添加用户头像
   * 
   * @param userId
   * @return
   */




  

  public Agency getAgency(Integer id) {
    Agency agency = new Agency();
    agency.setId(id);
    List<Agency> agencies = agencyMapper.select(agency);
    if (agencies.isEmpty()) {
      return null;
    }
    return agencies.get(0);
  }

  public List<Agency> getAllAgency() {
    return agencyMapper.select(new Agency());
  }
  
  public int add(Agency agency) {
    return  agencyMapper.insert(agency);
  }

  public void sendMsg(User agent, String msg, String name, String email) {
    // TODO Auto-generated method stub
    
  }

}
