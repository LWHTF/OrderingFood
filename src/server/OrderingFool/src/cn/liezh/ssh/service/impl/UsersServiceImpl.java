package cn.liezh.ssh.service.impl;

import java.util.List;

import cn.liezh.ssh.dao.UsersDao;
import cn.liezh.ssh.domain.PageBean;
import cn.liezh.ssh.domain.Users;
import cn.liezh.ssh.service.UsersService;

public class UsersServiceImpl implements UsersService {

	// 注入用户管理的DAO
	private UsersDao usersDao;

	public void setUsersDao(UsersDao usersDao) {
		this.usersDao = usersDao;
	}

	public Users login(Users users) {
		Users existUsers = usersDao.findUserByUsernameAndPassword(users);
		return existUsers;
	}

	// 通过页码查询相应页的内容
	public PageBean<Users> findByPage(Integer currPage) {
		PageBean<Users> pageBean = new PageBean<Users>();
		// 封装当前页数
		pageBean.setCurrPage(currPage);
		// 封装当前每页需要显示的记录数
		int pageSize = 9;
		pageBean.setPageSize(pageSize);
		// 封装总记录数
		int totalCount = usersDao.findCount();
		pageBean.setTotalCount(totalCount);
		// 封装总页数
		double tc = totalCount;
		Double num = Math.ceil(tc / pageSize);
		pageBean.setTotalPage(num.intValue());
		// 封装每页的内容
		int begin = (currPage - 1) * pageSize;
		List<Users> list = usersDao.findByPage(begin, pageSize);
		pageBean.setList(list);
	//	pageBean.toString();

		return pageBean;
	}

	public void save(Users users) {
		usersDao.save(users);
	}

	/**
	 * 通过ID的值从DAO层中获取到用户的详细信息
	 */
	public Users findById(Integer uid) {
		return usersDao.findById(uid);
	}

	public void update(Users users) {
		usersDao.update(users);
	}

	public void delete(Users users) {
		usersDao.delete(users);
	}

}
