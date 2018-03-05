package com.osida.common.controller;

import com.osida.common.utils.ShiroUtils;
import com.osida.system.domain.UserDO;
import org.springframework.stereotype.Controller;

@Controller
public class BaseController {

	public UserDO getUser() {
		return ShiroUtils.getUser();
	}

	public Long getUserId() {
		return getUser().getUserId();
	}

	public String getUsername() {
		return getUser().getUsername();
	}
}
