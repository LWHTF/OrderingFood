package cn.liezh.ssh.action;

import cn.liezh.ssh.domain.PageBean;
import cn.liezh.ssh.domain.Users;
import cn.liezh.ssh.service.UsersService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 用户管理的Action类
 * 
 * @author Administrator
 * 
 */
public class UsersAction extends ActionSupport implements ModelDriven<Users> {

	// 模型驱动需要的对象
	private Users users = new Users();

	public Users getModel() {
		// TODO Auto-generated method stub
		return users;
	}

	/**
	 * 获取service对象
	 */
	private UsersService usersService;

	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}

	// 后台web页面登录的方法
	public String login() {
		Users existUsers = usersService.login(users);
		if (existUsers != null) {
			this.addActionError("登录名或密码错误！");
			return INPUT;
		} else {
			ActionContext.getContext().getSession()
					.put("existUsers", existUsers);
			return SUCCESS;
		}
	}

	private Integer currPage = 1;

	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	// 后台分页查询所有用户的信息
	public String findAll() {
		PageBean<Users> pageBean = usersService.findByPage(currPage);
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAll";
	}

	// 跳转到添加页面
	public String saveUI() {
		return "saveUI";
	}

	// 调用业务层的保存方法，完成保存操作
	public String save() {
		usersService.save(users);
		return "saveSuccess";
	}

	/**
	 * 获取要修改内容的所有属性值后，跳转到编辑页面
	 * 
	 * @return
	 */
	public String edit() {
		users = usersService.findById(users.getUid());
		return "editSuccess";
	}

	/**
	 * 修改用户信息的执行方法
	 * 
	 * @return
	 */
	public String update() {
		usersService.update(users);
		return "updateSuccess";
	}
	
	/**
	 * 删除用户的执行方法
	 * @return
	 */
	public String delete() {
		users = usersService.findById(users.getUid());
		usersService.delete(users);
		return "deleteSuccess";
	}

}
