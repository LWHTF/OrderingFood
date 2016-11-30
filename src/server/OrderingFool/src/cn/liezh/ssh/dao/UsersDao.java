package cn.liezh.ssh.dao;

import java.util.List;

import cn.liezh.ssh.domain.Users;


public interface UsersDao {

	Users findUserByUsernameAndPassword(Users users);

	int findCount();

	List<Users> findByPage(int begin, int pageSize);

	void save(Users users);

	Users findById(Integer uid);

	void update(Users users);

	void delete(Users users);

	
}
