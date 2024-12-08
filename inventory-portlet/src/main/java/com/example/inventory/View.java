package com.example.inventory;

import com.example.inventory.model.Product;
import com.example.inventory.service.ProductLocalService;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.portlet.faces.annotation.BridgeRequestScoped;

import org.osgi.service.cdi.annotations.Reference;

@Named
@BridgeRequestScoped
public class View {
	
	@Reference
	@Inject ProductLocalService productLocalService;

	//private static Logger LOGGER = Logger.getLogger(View.class);

	//private UIForm form;
	private long id;
	private String code;
	private String name;

	/*
	public View() {
		this.form = new UIForm();
	}

	public UIForm getForm() {
		return form;
	}

	public void setForm(UIForm form) {
		this.form = form;
	}
	*/

	public List<Product> getProducts() {
		List<Product> products = null;
		try {
			products = productLocalService.getProducts(0, Integer.MAX_VALUE);
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
		System.err.println("add product");
		Product product = productLocalService.createProduct(0);
		product.setCode(code);
		product.setName(name);
		productLocalService.addProduct(product);
		System.err.println("product added with id " + id);
		return "ok";
	}

}
