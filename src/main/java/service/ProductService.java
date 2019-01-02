package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ProductDao;
import entities.Product;
import impl.IProduct;

@Service
public class ProductService implements IProduct {

	@Autowired
	private ProductDao productDao;

	public boolean create(Product object) {
		return productDao.create(object);
	}

	public boolean update(Product object) {
		return productDao.update(object);
	}

	public boolean delete(Product object) {
		return productDao.delete(object);
	}

	public Product findById(Integer productId) {
		return productDao.findById(productId);
	}

	public List<Product> getListByCategory(Integer categoryId) {
		return productDao.getListByCategory(categoryId);
	}

	public List<Product> getListByCategoryAndLimit(Integer categoryId, int limit) {
		return productDao.getListByCategoryAndLimit(categoryId, limit);
	}

	public List<Product> getListFeatured(int limit) {
		return productDao.getListFeatured(limit);
	}

	public List<Product> getListSale(int limit) {
		return productDao.getListSale(limit);
	}

	public List<Product> getListNav(int start, int limit) {
		return productDao.getListNav(start, limit);
	}

}
