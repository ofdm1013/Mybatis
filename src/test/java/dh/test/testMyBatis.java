package dh.test;



import hd.model.User;
import hd.service.UserService;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class testMyBatis {
	/*
	 * Spring3.X jdk8 java.lang.IllegalArgumentException
	 * 解决办法：
		一：把jdk版本换成1.7 or 1.7以下
		二：使用spring 4.0RELEASE及以上版本
	 */
	
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@Test
	public void test(){
		String s=userService.getUserById(1);
		System.out.println(s);
	}
	
	@Test
	public void test2(){
		/*ApplicationContext ac2=new ClassPathXmlApplicationContext( "classpath:spring.xml", "classpath:spring-mybatis.xml" );
		UserService userService=(UserService) ac2.getBean("userService");*/
		User u=userService.findUserById(1);
		System.out.println(u.getName());
	}
	
	@Test
	public void test3(){
		/*ApplicationContext ac2=new ClassPathXmlApplicationContext( "classpath:spring.xml", "classpath:spring-mybatis.xml" );
		UserService userService=(UserService) ac2.getBean("userService");*/
		List<User> l=userService.getAll();
		for(int i=0;i<l.size();i++)
			System.out.println(l.get(i).getName());
	}
}
