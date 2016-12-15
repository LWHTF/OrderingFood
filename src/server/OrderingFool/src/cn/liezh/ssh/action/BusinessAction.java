package cn.liezh.ssh.action;

import cn.liezh.ssh.domain.Business;
import cn.liezh.ssh.domain.PageBean;
import cn.liezh.ssh.service.BusinessService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BusinessAction extends ActionSupport implements
		ModelDriven<Business> {

	// 模型驱动需要的对象
	Business business = new Business();

	public Business getModel() {
		// TODO Auto-generated method stub
		return business;
	}

	/**
	 * 获取service对象
	 */
	private BusinessService businessService;

	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
	}

	private Integer currPage = 1;

	public void setCurrPage(Integer currPage) {
		this.currPage = currPage;
	}

	// 后台分页查询所有商铺的信息
	public String findAll() {
		PageBean<Business> pageBean = businessService.findByPage(currPage);
		// System.out.println("\n\n1111111111111111111---"+pageBean.getList().size());
		ActionContext.getContext().getValueStack().push(pageBean);
		return "findAll";
	}

	// 跳转到添加页面
	public String saveUI() {
		return "saveUI";
	}

	// 调用业务层的保存方法，完成保存操作
	public String save() {
		businessService.save(business);
		return "saveSuccess";
	}

	/**
	 * 获取要修改内容的所有属性值后，跳转到编辑页面
	 * 
	 * @return
	 */
	public String edit() {
		business = businessService.findById(business.getBid());
		return "editSuccess";
	}

	/**
	 * 修改商铺信息的执行方法
	 * 
	 * @return
	 */
	public String update() {
		businessService.update(business);
		return "updateSuccess";
	}

	/**
	 * 删除商铺的执行方法
	 * 
	 * @return
	 */
	public String delete() {
		business = businessService.findById(business.getBid());
		businessService.delete(business);
		return "deleteSuccess";
	}

}
