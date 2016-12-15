package cn.liezh.ssh.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.liezh.ssh.dao.BusinessDao;
import cn.liezh.ssh.domain.Business;

public class BusinessDaoImpl extends HibernateDaoSupport implements BusinessDao {

	public int findCount() {
		String hql = "select count(*) from Business";
		List<Long> list = this.getHibernateTemplate().find(hql);
		if (list.size() > 0) {
			return list.get(0).intValue();
		}
		return 0;
	}

	public List<Business> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Business.class);
		List<Business> list = this.getHibernateTemplate().findByCriteria(criteria,
				begin, pageSize);
		System.out.println("\n\n2222222222222222"+list.get(0).getPhoneNum().toString());
		return list;
	}

	public void save(Business business) {
		this.getHibernateTemplate().save(business);

	}

	public Business findById(Integer bid) {
		return this.getHibernateTemplate().get(Business.class, bid);
	}

	public void update(Business business) {
		this.getHibernateTemplate().update(business);

	}

	public void delete(Business business) {
		this.getHibernateTemplate().delete(business);

	}

}
