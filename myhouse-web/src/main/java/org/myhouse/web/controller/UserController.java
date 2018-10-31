package org.myhouse.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.myhouse.biz.service.AgencyService;
import org.myhouse.biz.service.UserService;
import org.myhouse.common.ResultMsg;
import org.myhouse.common.model.Agency;
import org.myhouse.common.model.User;


@Controller
public class UserController {
	@Autowired
	private AgencyService agencyService;
	@Autowired
	private UserService userService;
	
	public String accountRegister(User account,ModelMap map){
		//跳转注册页面
		if(account == null){
			//获取机构列表
			List<Agency>  list = agencyService.getAllAgency();
			
			map.put("agencyList",list );
			return "/user/accounts/register";
		}
		ResultMsg resultmsg = UserHelper.validate(account);
		if(resultmsg.isSuccess()&&userService.saveUser(account)){
			
			
			
		}else{
			return "redirect:";
		}
		return null;
		
	}
	
}
