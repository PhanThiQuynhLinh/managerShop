package impl;

import java.util.List;

import entities.Category;

public interface ICategory {
	// create
	public boolean create(Category object);

	// update
	public boolean update(Category object);

	// delete
	public boolean delete(Category object);

	// find by id
	public Category findById(Integer categoryId);

	// load list category
	public List<Category> getAll();
}
