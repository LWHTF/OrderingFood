package cn.liezh.ssh.service;

import cn.liezh.ssh.domain.PageBean;
import cn.liezh.ssh.domain.Users;

public interface UsersService {

	public Users login(Users users);

	public PageBean<Users> findByPage(Integer currPage);

	public void save(Users users);

	public Users findById(Integer uid);

	public void update(Users users);

	public void delete(Users users);

}
