package cn.liezh.ssh.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.liezh.ssh.dao.UsersDao;
import cn.liezh.ssh.domain.PageBean;
import cn.liezh.ssh.domain.Users;

public class UsersDaoImpl extends HibernateDaoSupport implements UsersDao {

	public Users findUserByUsernameAndPassword(Users users) {
		String hql = "from Users where username=? and password=?";
		List<Users> list = this.getHibernateTemplate().find(hql,
				users.getUsername(), users.getPassword());
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	public int findCount() {
		String hql = "select count(*) from Users";
		List<Long> list = this.getHibernateTemplate().find(hql);
		if (list.size() > 0) {
			return list.get(0).intValue();
		}
		return 0;
	}

	public List<Users> findByPage(int begin, int pageSize) {
		DetachedCriteria criteria = DetachedCriteria.forClass(Users.class);
		List<Users> list = this.getHibernateTemplate().findByCriteria(criteria,
				begin, pageSize);
		System.out.println("\n\n2222222222222222"+list.get(0).getPhoneNum().toString());
		return list;
	}

	/**
	 * DAO层向数据库当中保存用户信息
	 */
	public void save(Users users) {
		this.getHibernateTemplate().save(users);
	}

	/**
	 * DAO层中通过id从数据库中获取用户的详细信息
	 */
	public Users findById(Integer uid) {
		return this.getHibernateTemplate().get(Users.class, uid);
	}

	public void update(Users users) {
		this.getHibernateTemplate().update(users);
	}

	public void delete(Users users) {
		this.getHibernateTemplate().delete(users);
	}

}
