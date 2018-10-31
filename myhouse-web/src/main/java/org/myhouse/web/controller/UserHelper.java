package org.myhouse.web.controller;

import org.apache.commons.lang3.StringUtils;
import org.myhouse.common.ResultMsg;
import org.myhouse.common.model.User;


public class UserHelper {
	
	public static ResultMsg validate(User account){
		if(StringUtils.isBlank(account.getEmail())){
			return ResultMsg.errorMsg("Email 错误");
		}
		if(StringUtils.isBlank(account.getPasswd())||StringUtils.isBlank(account.getConfirmPasswd())
				||!(account.getPasswd()).equals(account.getConfirmPasswd())){
			return ResultMsg.errorMsg("密码错误");
		}
		if(account.getPasswd().length() < 6){
			return ResultMsg.errorMsg("密码长度小于6");
		}
		return ResultMsg.successMsg("");
	}

}
