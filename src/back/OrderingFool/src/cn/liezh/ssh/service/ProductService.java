package cn.liezh.ssh.service;

import org.springframework.transaction.annotation.Transactional;
import cn.liezh.ssh.dao.ProductDao;
import cn.liezh.ssh.domain.Product;

/**
 * 商品管理的service类
 */
@Transactional
public class ProductService {
	private ProductDao productDao;

	/**
	 * @param productDao the productDao to set
	 */
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	public void save(Product product) {
		System.out.println("service中的save方法执行了....");
		productDao.save(product);
	}
	
}
