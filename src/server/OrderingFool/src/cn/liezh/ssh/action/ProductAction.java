package cn.liezh.ssh.action;

import cn.liezh.ssh.domain.Product;
import cn.liezh.ssh.service.ProductService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * ��Ʒ�����action��
 */
@SuppressWarnings("serial")
public class ProductAction extends ActionSupport implements ModelDriven<Product>{
	//ģ������ʹ�õ���
	private Product product = new Product();
	private ProductService productService;
	/**
	 * @param productService the productService to set
	 */
	public Product getModel() {
		return product;
	}
	/**
	 *struts �� spring����
	 */
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	public void save(){
		System.out.println("action�е�save����ִ����....");
		productService.save(product);
	}
}
