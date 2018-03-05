package com.osida.system;

import com.osida.system.dao.UserDOMapper;
import com.osida.system.domain.UserDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManagementApplicationTests {

	@Autowired
	private UserDOMapper userDOMapper;
	@Test
	public void contextLoads() {
		List<UserDO> userDOS = userDOMapper.selectAll();
		System.out.println(userDOS);
	}

}
