package cn.liezh.ssh.action;

import cn.liezh.ssh.domain.PageBean;
import cn.liezh.ssh.domain.Users;
import cn.liezh.ssh.service.UsersService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * �û������Action��
 * 
 * @author Administrator
 * 
 */
public class UsersAction extends ActionSupport implements ModelDriven<Users> {

	// ģ��������Ҫ�Ķ���
	private Users users = new Users();

	public Users getModel() {
		// TODO Auto-generated method stub
		return users;
	}

	/**
	 * ��ȡservice����
	 */
	private UsersService usersService;

	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}

	// ��̨webҳ���¼�ķ���
	public String login() {
		Users existUsers = usersService.login(users);
		if (existUsers != null) {
			this.addActionError("��¼�����������");
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

	// ��̨��ҳ��ѯ�����û�����Ϣ
	public String findAll() {
		PageBean<Users> pageBean = usersService.findByPage(currPage);
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAll";
	}

	// ��ת�����ҳ��
	public String saveUI() {
		return "saveUI";
	}

	// ����ҵ���ı��淽������ɱ������
	public String save() {
		usersService.save(users);
		return "saveSuccess";
	}

	/**
	 * ��ȡҪ�޸����ݵ���������ֵ����ת���༭ҳ��
	 * 
	 * @return
	 */
	public String edit() {
		users = usersService.findById(users.getUid());
		return "editSuccess";
	}

	/**
	 * �޸��û���Ϣ��ִ�з���
	 * 
	 * @return
	 */
	public String update() {
		usersService.update(users);
		return "updateSuccess";
	}
	
	/**
	 * ɾ���û���ִ�з���
	 * @return
	 */
	public String delete() {
		users = usersService.findById(users.getUid());
		usersService.delete(users);
		return "deleteSuccess";
	}

}
