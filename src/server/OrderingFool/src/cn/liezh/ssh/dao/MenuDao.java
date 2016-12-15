package cn.liezh.ssh.dao;

import java.util.List;

import cn.liezh.ssh.domain.Business;
import cn.liezh.ssh.domain.Menus;

public interface MenuDao {

	public int findCount();

	public List<Menus> findByPage(int begin, int pageSize);

	public void save(Menus menus);

	public Menus findById(Integer bid);

	public void update(Menus menus);

	public void delete(Menus menus);
}
