package cn.liezh.ssh.action;

import cn.liezh.ssh.domain.Business;
import cn.liezh.ssh.domain.PageBean;
import cn.liezh.ssh.service.BusinessService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BusinessAction extends ActionSupport implements
		ModelDriven<Business> {

	// ģ��������Ҫ�Ķ���
	Business business = new Business();

	public Business getModel() {
		// TODO Auto-generated method stub
		return business;
	}

	/**
	 * ��ȡservice����
	 */
	private BusinessService businessService;

	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
	}

	private Integer currPage = 1;

	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	// ��̨��ҳ��ѯ�������̵���Ϣ
	public String findAll() {
		PageBean<Business> pageBean = businessService.findByPage(currPage);
		// System.out.println("\n\n1111111111111111111---"+pageBean.getList().size());
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAll";
	}

	// ��ת�����ҳ��
	public String saveUI() {
		return "saveUI";
	}

	// ����ҵ���ı��淽������ɱ������
	public String save() {
		businessService.save(business);
		return "saveSuccess";
	}

	/**
	 * ��ȡҪ�޸����ݵ���������ֵ����ת���༭ҳ��
	 * 
	 * @return
	 */
	public String edit() {
		business = businessService.findById(business.getBid());
		return "editSuccess";
	}

	/**
	 * �޸�������Ϣ��ִ�з���
	 * 
	 * @return
	 */
	public String update() {
		businessService.update(business);
		return "updateSuccess";
	}

	/**
	 * ɾ�����̵�ִ�з���
	 * 
	 * @return
	 */
	public String delete() {
		business = businessService.findById(business.getBid());
		businessService.delete(business);
		return "deleteSuccess";
	}

}
