package cn.liezh.ssh.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.liezh.ssh.domain.Product;

/**
 * ��Ʒ�����dao��
 */
public class ProductDao extends HibernateDaoSupport{
	public void save(Product product) {
		this.getHibernateTemplate().save(product);
		System.out.println("dao�е�save����ִ����....");
	}

}
