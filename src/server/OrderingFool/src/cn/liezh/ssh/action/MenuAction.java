package cn.liezh.ssh.action;

import javassist.expr.NewArray;
import cn.liezh.ssh.domain.Business;
import cn.liezh.ssh.domain.Menus;
import cn.liezh.ssh.domain.PageBean;
import cn.liezh.ssh.service.BusinessService;
import cn.liezh.ssh.service.MenuSercive;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

public class MenuAction implements ModelDriven<Menus> {

	// ģ��������Ҫ�Ķ���
	Menus menus = new Menus();

	public Menus getModel() {
		// TODO Auto-generated method stub
		return menus;
	}

	private Integer currPage = 1;

	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	/**
	 * ��ȡservice����
	 */
	private MenuSercive menuSercive;

	public void setBusinessService(MenuSercive menuSercive) {
		this.menuSercive = menuSercive;
	}

	// ��̨��ҳ��ѯ�������̵���Ϣ
	public String findAll() {
//		PageBean<Menus> pageBean = menuSercive.findByPage(currPage);
//		// System.out.println("\n\n1111111111111111111---"+pageBean.getList().size());
//		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAll";
	}
}
