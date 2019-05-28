package io.github.itliwei.demo;

import io.github.itliwei.demo.entity.User;
import io.github.itliwei.demo.service.UserService;
import io.github.itliwei.mvcorm.UserQueryModel;
import io.github.itliwei.mvcorm.orm.IdEntity;
import io.github.itliwei.mvcorm.orm.opt.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ImserverApplicationTests {
	@Autowired
	private UserService userService;

	@Test
	public void testSave() {
		User user = new User();
		user.setUsername("liw411");
		user.setAge(18);
		userService.save(user);
	}

	@Test
	public void testUpdate() {
		User user = new User();
		user.setId(1L);
		user.setAge(17);
		userService.update(user);
	}

	@Test
	public void testUpdateUseNull() {
		User user = new User();
		user.setId(2L);
		user.setAge(17);
		userService.update(user,true);
	}

	@Test
	public void testQuery() {
		UserQueryModel userQueryModel = new UserQueryModel();
		userQueryModel.setUsernameEQ("liw411");
		User user =
				userService.findOne(userQueryModel);
		System.out.println(user);
		List<User> list = userService.findList(userQueryModel);
		System.out.println(list);
		Page<IdEntity> page = userService.findPage(userQueryModel);

		System.out.println(page);


	}

}
