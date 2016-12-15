package cn.liezh.ssh.service.impl;

import java.util.List;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Zephyr;

import javassist.expr.NewArray;

import cn.liezh.ssh.dao.BusinessDao;
import cn.liezh.ssh.domain.Business;
import cn.liezh.ssh.domain.PageBean;
import cn.liezh.ssh.service.BusinessService;

/**
 * ���̹���ҵ������
 * @author Administrator
 *
 */
public class BusinessServiceImpl implements BusinessService{

	// ע�����̹����DAO
	private BusinessDao businessDao;

	public void setBusinessDao(BusinessDao businessDao) {
		this.businessDao = businessDao;
	}
	
	// ͨ��ҳ���ѯ��Ӧҳ������
	public PageBean<Business> findByPage(Integer currPage) {
		PageBean<Business> pageBean = new PageBean<Business>();
		// ��װ��ǰҳ��
		pageBean.setCurrPage(currPage);
		// ��װ��ǰÿҳ��Ҫ��ʾ�ļ�¼��
		int pageSize = 9;
		pageBean.setPageSize(pageSize);
		// ��װ�ܼ�¼��
		int totalCount = businessDao.findCount();
		pageBean.setTotalCount(totalCount);
		// ��װ��ҳ��
		double tc = totalCount;
		Double num = Math.ceil(tc / pageSize);
		pageBean.setTotalPage(num.intValue());
		// ��װÿҳ������
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
