package cn.liezh.ssh.dao;

import java.util.List;

import cn.liezh.ssh.domain.Users;


public interface UsersDao {

	public Users findUserByUsernameAndPassword(Users users);

	public int findCount();

	public List<Users> findByPage(int begin, int pageSize);

	public void save(Users users);

	public Users findById(Integer uid);

	public void update(Users users);

	public void delete(Users users);

	
}
