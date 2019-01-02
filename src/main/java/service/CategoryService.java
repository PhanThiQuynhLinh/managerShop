package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.CategoryDao;
import entities.Category;
import impl.ICategory;

@Service
public class CategoryService implements ICategory {
	@Autowired
	private CategoryDao categoryDao;

	public boolean create(Category object) {
		return categoryDao.create(object);
	}

	public boolean update(Category object) {
		return categoryDao.update(object);
	}

	public boolean delete(Category object) {
		return categoryDao.delete(object);
	}

	public Category findById(Integer categoryId) {
		return categoryDao.findById(categoryId);
	}

	public List<Category> getAll() {
		return categoryDao.getAll();
	}

}
