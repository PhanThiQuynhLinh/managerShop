package entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name = "category")
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int categoryId;

	@Column(name = "categoryName")
	private String categoryName;
	
	@Column(name = "categoryDate")
	private Date date;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoryId")
	private List<Product> listProduct;

	public Category() {
	}

	public Category(int categoryId, String categoryName, Date date, List<Product> listProduct) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.date = date;
		this.listProduct = listProduct;
	}
	

	public Category(int categoryId, String categoryName, Date date) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.date = date;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Product> getListProduct() {
		return listProduct;
	}

	public void setListProduct(List<Product> listProduct) {
		this.listProduct = listProduct;
	}




	

}
