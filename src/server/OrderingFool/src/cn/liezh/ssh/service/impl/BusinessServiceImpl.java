package cn.liezh.ssh.service.impl;

import java.util.List;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Zephyr;

import javassist.expr.NewArray;

import cn.liezh.ssh.dao.BusinessDao;
import cn.liezh.ssh.domain.Business;
import cn.liezh.ssh.domain.PageBean;
import cn.liezh.ssh.service.BusinessService;

/**
 * 商铺管理业务层的类
 * @author Administrator
 *
 */
public class BusinessServiceImpl implements BusinessService{

	// 注入商铺管理的DAO
	private BusinessDao businessDao;

	public void setBusinessDao(BusinessDao businessDao) {
		this.businessDao = businessDao;
	}
	
	// 通过页码查询相应页的内容
	public PageBean<Business> findByPage(Integer currPage) {
		PageBean<Business> pageBean = new PageBean<Business>();
		// 封装当前页数
		pageBean.setCurrPage(currPage);
		// 封装当前每页需要显示的记录数
		int pageSize = 9;
		pageBean.setPageSize(pageSize);
		// 封装总记录数
		int totalCount = businessDao.findCount();
		pageBean.setTotalCount(totalCount);
		// 封装总页数
		double tc = totalCount;
		Double num = Math.ceil(tc / pageSize);
		pageBean.setTotalPage(num.intValue());
		// 封装每页的内容
		int begin = (currPage - 1) * pageSize;
		List<Business> list = null;
		if(totalCount > 0 )
		{
			list = businessDao.findByPage(begin, pageSize);
		}
		pageBean.setList(list);
		System.out.println("____________________"+pageBean.toString());

		return pageBean;
	}

	public void save(Business business) {
		businessDao.save(business);
		
	}

	public Business findById(Integer bid) {
		
		return businessDao.findById(bid);
	}

	public void update(Business business) {
		businessDao.update(business);
	}

	public void delete(Business business) {
		businessDao.delete(business);
		
	}

	
	
	
}
