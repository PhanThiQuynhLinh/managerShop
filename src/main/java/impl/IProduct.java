package impl;

import java.util.List;

import entities.Product;

public interface IProduct {
	// create
	public boolean create(Product object);

	// update
	public boolean update(Product object);

	// delete
	public boolean delete(Product object);

	// find by id
	public Product findById(Integer productId);

	// load list product by category
	public List<Product> getListByCategory(Integer categoryId);

	// load list product by category and limit
	public List<Product> getListByCategoryAndLimit(Integer categoryId, int limit);

	// load list product by featured
	public List<Product> getListFeatured(int limit);

	// load list product by sale
	public List<Product> getListSale(int limit);

	// load list product by nav
	public List<Product> getListNav(int start, int limit);
}
