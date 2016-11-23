package cn.liezh.ssh.action;

import cn.liezh.ssh.domain.Product;
import cn.liezh.ssh.service.ProductService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 商品管理的action类
 */
@SuppressWarnings("serial")
public class ProductAction extends ActionSupport implements ModelDriven<Product>{
	//模板驱动使用的类
	private Product product = new Product();
	private ProductService productService;
	/**
	 * @param productService the productService to set
	 */
	public Product getModel() {
		return product;
	}
	/**
	 *struts 和 spring整合
	 */
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	public void save(){
		System.out.println("action中的save方法执行了....");
		productService.save(product);
	}
}
