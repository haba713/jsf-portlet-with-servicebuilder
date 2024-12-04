package com.example.inventory;

import com.example.inventory.model.Product;
import com.example.inventory.service.ProductLocalServiceUtil;
import org.apache.log4j.Logger;

import javax.faces.component.UIForm;

import java.io.Serializable;
import java.util.List;

public class View implements Serializable {

	private static final long serialVersionUID = 1L;

	private static Logger LOGGER = Logger.getLogger(View.class);

	private UIForm form;
	private long id;
	private String code;
	private String name;

	public View() {
		this.form = new UIForm();
	}

	public UIForm getForm() {
		return form;
	}

	public void setForm(UIForm form) {
		this.form = form;
	}

	public List<Product> getProducts() {
		List<Product> products = null;
		try {
			products = ProductLocalServiceUtil.getProducts(0, Integer.MAX_VALUE);
			products.forEach(product -> {
				System.err.println("product: id = " + product.getId() + ", code = " + product.getCode() + ", name = "
						+ product.getName());
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String addProduct() {
		LOGGER.debug("add product");
		Product product = ProductLocalServiceUtil.createProduct(0);
		product.setCode(code);
		product.setName(name);
		ProductLocalServiceUtil.addProduct(product);
		LOGGER.debug("product added with id " + id);
		return "ok";
	}

}
