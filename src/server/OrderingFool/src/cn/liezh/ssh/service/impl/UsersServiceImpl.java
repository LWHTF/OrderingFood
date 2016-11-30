package cn.liezh.ssh.service.impl;

import java.util.List;

import cn.liezh.ssh.dao.UsersDao;
import cn.liezh.ssh.domain.PageBean;
import cn.liezh.ssh.domain.Users;
import cn.liezh.ssh.service.UsersService;

public class UsersServiceImpl implements UsersService {

	// ע���û������DAO
	private UsersDao usersDao;

	public void setUsersDao(UsersDao usersDao) {
		this.usersDao = usersDao;
	}

	public Users login(Users users) {
		Users existUsers = usersDao.findUserByUsernameAndPassword(users);
		return existUsers;
	}

	// ͨ��ҳ���ѯ��Ӧҳ������
	public PageBean<Users> findByPage(Integer currPage) {
		PageBean<Users> pageBean = new PageBean<Users>();
		// ��װ��ǰҳ��
		pageBean.setCurrPage(currPage);
		// ��װ��ǰÿҳ��Ҫ��ʾ�ļ�¼��
		int pageSize = 9;
		pageBean.setPageSize(pageSize);
		// ��װ�ܼ�¼��
		int totalCount = usersDao.findCount();
		pageBean.setTotalCount(totalCount);
		// ��װ��ҳ��
		double tc = totalCount;
		Double num = Math.ceil(tc / pageSize);
		pageBean.setTotalPage(num.intValue());
		// ��װÿҳ������
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
	 * ͨ��ID��ֵ��DAO���л�ȡ���û�����ϸ��Ϣ
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
