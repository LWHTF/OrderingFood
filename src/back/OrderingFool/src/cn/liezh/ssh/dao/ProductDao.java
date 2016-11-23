package cn.liezh.ssh.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.liezh.ssh.domain.Product;

/**
 * 商品管理的dao类
 */
public class ProductDao extends HibernateDaoSupport{
	public void save(Product product) {
		this.getHibernateTemplate().save(product);
		System.out.println("dao中的save方法执行了....");
	}

}
