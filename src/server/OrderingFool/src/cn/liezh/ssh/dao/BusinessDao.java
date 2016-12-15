package cn.liezh.ssh.dao;

import java.util.List;

import cn.liezh.ssh.domain.Business;
import cn.liezh.ssh.domain.Users;

public interface BusinessDao {

	public int findCount();

	public List<Business> findByPage(int begin, int pageSize);

	public void save(Business business);

	public Business findById(Integer bid);

	public void update(Business business);

	public void delete(Business business);
}
