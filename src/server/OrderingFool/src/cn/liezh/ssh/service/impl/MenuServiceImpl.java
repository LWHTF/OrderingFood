package cn.liezh.ssh.service.impl;

import cn.liezh.ssh.dao.BusinessDao;
import cn.liezh.ssh.dao.MenuDao;
import cn.liezh.ssh.domain.Menus;
import cn.liezh.ssh.domain.PageBean;
import cn.liezh.ssh.service.MenuSercive;

public class MenuServiceImpl implements MenuSercive {

	// 注入商铺管理的DAO
	private MenuDao menuDao;

	public void setMenuDao(MenuDao menuDao) {
		this.menuDao = menuDao;
	}
	
	
	public PageBean<Menus> findByPage(Integer currPage) {
		// TODO Auto-generated method stub
		return null;
	}

	public void save(Menus menus) {
		// TODO Auto-generated method stub

	}

	public Menus findById(Integer bid) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Menus menus) {
		// TODO Auto-generated method stub

	}

	public void delete(Menus menus) {
		// TODO Auto-generated method stub

	}

}
