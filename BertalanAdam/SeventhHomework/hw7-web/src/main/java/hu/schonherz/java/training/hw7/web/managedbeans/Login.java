package hu.schonherz.java.training.hw7.web.managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import hu.schonerz.java.training.hw7.service.UserService;
import hu.schonerz.java.training.hw7.vo.UserVo;

@ManagedBean(name = "loginBean")
@SessionScoped
public class Login {

	@ManagedProperty("#{userService}")
	private UserService userService;

	private String username;
	private String password;

	public Login() {
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public String validateUserAndPassword() {
		UserVo user = new UserVo();

		user.setName(username);
		user.setPassword(password);

		System.out.println(user.getName() + " " + user.getPassword());

		if (getUserService() == null) {
			System.out.println("User service null");
		}

		if (getUserService().validate(user)) {
			// System.out.println("VALID");
			// HttpSession session = SessionBean.getSession();
			// session.setAttribute("username", username);
			return "login"; // admin
		} else {
			// System.out.println("NOT VALID");
			// FacesContext.getCurrentInstance().addMessage(
			// null,
			// new FacesMessage(FacesMessage.SEVERITY_WARN,
			// "Incorrect Username and Passowrd",
			// "Please enter correct username and Password"));
			return "login";
		}
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
