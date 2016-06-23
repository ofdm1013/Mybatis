package hd.control;

import javax.servlet.http.HttpServletRequest;

import hd.model.User;
import hd.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userControl")
public class UserControl {
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	@RequestMapping("/{id}/showUser")//http://localhost:8080/Mybatis/userControl/1/showUser.do
	/*@RequestMapping("/showUser")//http://localhost:8080/Mybatis/userControl/showUser.do?id=1
*/	public String ShowUser(@PathVariable Integer id,HttpServletRequest req){
		User u=userService.findUserById(id);
		req.setAttribute("u", u);	
		return "showUser";
	}
}
