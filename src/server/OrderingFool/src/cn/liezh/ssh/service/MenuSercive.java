package cn.liezh.ssh.service;

import cn.liezh.ssh.domain.Menus;
import cn.liezh.ssh.domain.PageBean;

public interface MenuSercive {
	
	public PageBean<Menus> findByPage(Integer currPage);
	
	public void save(Menus menus);

	public Menus findById(Integer bid);
	
	public void update(Menus menus);

	public void delete(Menus menus);
}
