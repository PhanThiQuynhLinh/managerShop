package entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;

	@Column(name = "productName")
	private String productName;

	@Column(name = "productImage")
	private String productImage;

	@Column(name = "productPrice")
	private double productPrice;


	@Column(name = "productSale")
	private int productSale;
	
	@Column(name = "productDescription")
	private String productDescription;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoryId")
	private Category category;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "product_receipitem",
			joinColumns = {@JoinColumn(name = "productId")},
			inverseJoinColumns = {@JoinColumn(name = "receiptItemId")})
	private Set<ReceiptItem> receiptItems;
	
	public Product() {
	}

	public Product(int productId, String productName, String productImage, double productPrice, int productSale,
			String productDescription, Category category, Set<ReceiptItem> receiptItems) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productImage = productImage;
		this.productPrice = productPrice;
		this.productSale = productSale;
		this.productDescription = productDescription;
		this.category = category;
		this.receiptItems = receiptItems;
	}

	public Product(int productId, String productName, String productImage, double productPrice, int productSale,
			String productDescription) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productImage = productImage;
		this.productPrice = productPrice;
		this.productSale = productSale;
		this.productDescription = productDescription;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductSale() {
		return productSale;
	}

	public void setProductSale(int productSale) {
		this.productSale = productSale;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Set<ReceiptItem> getReceiptItems() {
		return receiptItems;
	}

	public void setReceiptItems(Set<ReceiptItem> receiptItems) {
		this.receiptItems = receiptItems;
	}

}
