package com.osida.common.utils;

import com.osida.system.domain.UserDO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

public class ShiroUtils {

	@Autowired
	private static SessionDAO sessionDAO;

	public static Subject getSubject() {
		return SecurityUtils.getSubject();
	}

	public static UserDO getUser() {
		Object object = getSubject().getPrincipal();
		return (UserDO)object;
	}

	public static Long getUserId() {
		return getUser().getUserId();
	}

	public static void logout() {
		getSubject().logout();
	}
}
