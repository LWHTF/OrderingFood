package cn.liezh.ssh.service;

import cn.liezh.ssh.domain.Business;
import cn.liezh.ssh.domain.PageBean;

public interface BusinessService {

	public PageBean<Business> findByPage(Integer currPage);

	public void save(Business business);

	public Business findById(Integer bid);
	
	public void update(Business business);

	public void delete(Business business);
}
